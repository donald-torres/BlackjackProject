# BlackjackProject
### Overview

   This program simulates a BlackJack table in a Casino. The player/user sits at the table and plays a round(s) of the card game BlackJack with the dealer.  The program starts with a prompt askinig the user if they want to play a the game. If the answer is yes then the game starts and the dealer deals 4 cards 2 to the player and 2 to itself one face down.  The player then states if they wish to hit and get another card or stay with their current hand. The game concludes when either the user or the dealer bust(go over 21 point in their hand) or makes BlackJack(gets 21 points exactly).  If the player chooses to stay below 21 points the dealer then begins their turn following the rule of 17(if their point are below 17 they must hit). Once the dealer is satisfied with their score then the winner is decided by whomever has the highest point value. The player can choose to keep playing the dealer but BEWARE the dealer can run out of cards if too many games are played consecutively.


### Technologies / Techniques Used

 - Java
 - Object-Oriented Programming
 - Enumerated data types
 - Array Lists


### How To Run

   Once running the program greets the user/player and asks them if they would like to play a round of BlackJack using the numbers 1 and 2 as an input.  If the player selects no the progam displays a goodbye message and closes.  If the player says yes the dealer deals 4 cards 2 to the player face up and 2 to itself one face down the other face up for the player to see.  Provided the player doesn't have BlackJack(21 points) they will then be prompted if they wish to hit or stay with their current cards/points.  If hit is chosen the dealer gives the player another card and the new value is calculated and displayed.  Provided the player does not go over a total point value of 21(Bust) they will have the option to hit or stay again. Once the total point value goes over 21 the dealer will announce that the player has busted and ask if the player wants to play another round. Once the player is satisfied with their point total the stay option will be selected and the dealer will begin their turn.  The dealer will announce their point total and either hit or stay based on the rule of 17.  If the dealers points are below 17 they will deal another card to themself once the rule of 17 is satisfied the dealer will announce the winner.  The winner is whomever has the highest point value but is no greater than 21 points, the winners cards are then displayed below the announcement.  The dealer will ask if the player wants to play another round and the game begins again if yes is selected.  The player can play as many rounds as they wish but the dealer will run out of cards if too many consecutive games are played, and the whole program must be restarted so the dealer can reshuffle their deck of cards.   

### Lessons Learned

   Pros - 

 - A better understanding of Enumerated data types.

 - Using object oriented programming to hold different values of the same data type.


   Cons - 
   The biggest obstacle during coding -
 - On occasion the dealer will deal 2 aces and the value of aces for this program is 11 so the inital had value could be 22 and the program will prompt a bust. To fix this 
   I added a statement during the inital evaluation of the hand value to change one of the aces to a 1 thus giving whomever had that hand a 12 instead of a 22.

