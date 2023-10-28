package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cards = new ArrayList<>();

	public Hand() {
	}

	public abstract int getHandValue();

	public abstract int doubleAces();

	public abstract boolean isBlackJack();

	public abstract boolean isBust();

	public void addCardHand(Card card) {
		cards.add(card);

	}

	public void clear() {
		cards.clear();

	}

	@Override
	public String toString() {
		return "With " + cards;
	}

}
