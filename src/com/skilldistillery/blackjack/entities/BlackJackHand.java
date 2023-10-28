package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
	}

	@Override
	public int getHandValue() {
		int handValue = 0;

		for (Card card : cards) {
			handValue += card.getValue();
		}
		return handValue;
	}

	public boolean isBlackJack() {
		boolean isBlackJack = false;
		if (getHandValue() == 21) {
			isBlackJack = true;
			System.out.println("BLACKJACK you win!!!");
		}
		return isBlackJack;
	}

	public boolean isBust() {
		boolean isBust = false;
		if (getHandValue() > 21) {
			isBust = true;
			System.out.println("Over 21 you BUST!!!");
		}
		return isBust;
	}

	@Override
	public int doubleAces() {
		int handValue = 12;
		return handValue;
	}
}
