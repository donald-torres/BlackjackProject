package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	private Deck deck = new Deck();

	public Dealer() {
	}

	public void clearHand() {

		hand.clear();
	}

	public void greetPlayer() {

		System.out.println("Hello and welcome to BlackJack\nWould you like to play a round?\n 1: Yes\n 2: No\n");
	}

	public void playAgain() {

		System.out.println("Would you like to play another round?\n 1: Yes\n 2: No\n");
	}

	public Card dealCard(Player player) {

		Card dealtCard = deck.dealCard();
		player.addCard(dealtCard);
		return dealtCard;
	}

	public void startGame(Player player) {

		deck.shuffle();
		System.out.println("You were dealt: " + dealCard(player));
		System.out.println("\nDealer lays their first card face down\n");
		dealCard(this);
		System.out.println("You were dealt " + dealCard(player) + "\n");
		System.out.println("Dealer places " + dealCard(this) + " down\n");

	}

	public void continueGame(Player player) {

		System.out.println("You have " + player.getPlayerValue() + " points.");

		if (player.getPlayerValue() == 22) {
			player.doubleAces();
		}
		if (player.getPlayerValue() == 21) {

			player.playerBlackJack();
			player.getCardValue();
		}
		if (player.getPlayerValue() < 21) {

			System.out.println("Would you like to Hit or Stay:\n1: Hit\n2: Stay");

		} else {
			player.playerBust();
		}
	}

	public void dealersTurn() {

		System.out.println("The Dealer has " + this.getPlayerValue() + "\n");

		if (this.getPlayerValue() == 22) {
			this.doubleAces();
		}
		if (this.getPlayerValue() == 21) {

			System.out.println("Dealer BlackJack House wins!!!\n");
		}
		while (this.getPlayerValue() < 17) {

			System.out.println("Dealer places " + dealCard(this) + " down\n");
			System.out.println("The Dealer has " + this.getPlayerValue() + "\n");

			if (this.getPlayerValue() > 21) {

				System.out.println("Dealer busts\n");
			}
		}
	}

	public void determineWinner(Player player) {

		if (this.getPlayerValue() > player.getPlayerValue() && this.getPlayerValue() <= 21) {

			System.out.println("House wins!!!");
			this.getCardValue();
			System.out.println();

		} else if (this.getPlayerValue() == player.getPlayerValue()) {

			System.out.println("It's a Draw\n");
			System.out.print("Dealer: ");
			this.getCardValue();
			System.out.print("Player: ");
			player.getCardValue();

		} else {

			System.out.println("You win!!!");
			player.getCardValue();
			System.out.println();

		}
	}

}
