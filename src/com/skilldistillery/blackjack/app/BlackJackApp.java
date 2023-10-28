package com.skilldistillery.blackjack.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {
	Scanner kb = new Scanner(System.in);
	Dealer dealer = new Dealer();
	Player player = new Player();
	int userInput;
	boolean keepPlayingHand = true;
	boolean keepPlayingGame = true;

	public static void main(String[] args) {

		BlackJackApp app = new BlackJackApp();
		app.run();
	}

	public void run() {

		try {
			while (userInput != 1) {

				dealer.greetPlayer();
				userInput = kb.nextInt();
				kb.nextLine();

				if (userInput == 1) {

					dealer.startGame(player);

				} else if (userInput == 2) {

					System.out.println("Okay Goodbye");
					kb.close();
					System.exit(0);

				} else {

					System.out.println("Invalid Entry");

				}
			}

			while (keepPlayingGame) {

				while (keepPlayingHand) {

					dealer.continueGame(player);
					userInput = kb.nextInt();
					kb.nextLine();

					if (userInput == 1) {

						System.out.println("You were dealt " + dealer.dealCard(player) + "\n");

						if (player.playerBust() || player.playerBlackJack()) {

							keepPlayingHand = false;
							player.clearHand();
							dealer.clearHand();

						}
					} else if (userInput == 2) {

						System.out.println("You stay at " + player.getPlayerValue() + " points\n");
						keepPlayingHand = false;
						dealer.dealersTurn();
						dealer.determineWinner(player);
						player.clearHand();
						dealer.clearHand();

					} else if (userInput != 1 || userInput != 2) {

						System.out.println("Invalid Entry");
					}
				}
				dealer.playAgain();
				userInput = kb.nextInt();
				kb.nextLine();

				if (userInput == 1) {

					dealer.startGame(player);
					keepPlayingHand = true;
					keepPlayingGame = true;

				} else if (userInput == 2) {

					keepPlayingGame = false;
					System.out.println("Okay Goodbye");
					kb.close();
					System.exit(0);

				} else {

					System.out.println("Invalid Entry");
				}

			}

		} catch (InputMismatchException e) {

			System.out.println("That's not a number I guess you don't want to play goodbye");
			keepPlayingGame = false;

		} catch (IndexOutOfBoundsException e) {

			System.out.println("Sorry we ran out of cards");
			keepPlayingGame = false;
		}
	}
}
