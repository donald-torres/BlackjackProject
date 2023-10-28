package com.skilldistillery.blackjack.entities;

public class Player {
	protected Hand hand = new BlackJackHand();

	public Player() {
	}

	public void addCard(Card card) {
		hand.addCardHand(card);
	}

	public void getCardValue() {
		System.out.println(hand.toString());
	}

	public int doubleAces() {
		return hand.doubleAces();
	}

	public int getPlayerValue() {
		return hand.getHandValue();
	}

	public void clearHand() {
		hand.clear();
	}

	public boolean playerBlackJack() {
		return hand.isBlackJack();

	}

	public boolean playerBust() {
		return hand.isBust();

	}

}
