import java.util.Scanner;
class Main{
	public static void main(String[] args){

    //Ask the player how much money they have
    Scanner money = new Scanner(System.in);
	System.out.print("Account Balance: ");
    double playerMoney = money.nextDouble();
    
		//Program for calling a Deck of Cards
		Deck playingDeck = new Deck();
		playingDeck.createFullDeck();
		playingDeck.shuffle();
		
		//Player's and Dealer's hand
		Deck pCards = new Deck();
		Deck dCards = new Deck();

    Scanner bet = new Scanner(System.in);
    
		//Keep running until player runs out of money
    while(playerMoney>0){
      //Determines if the game is done or not
      boolean finish = false;
    
  	  //Asks how much money you want to bet off of your account
  	  System.out.println("You have $" + playerMoney + ", how much would you like to bet?");
  	  double playerBet = bet.nextDouble();

      //Simple program saying that if u bet more then you have it stops to program
  	  if(playerBet > playerMoney){
  		  System.out.println("You cannot bet more than you have.");
  		  break;
  	  }
  
  	  //Player and Dealer gets two cards
  	  pCards.draw(playingDeck);
  	  pCards.draw(playingDeck);
  	  dCards.draw(playingDeck);
  	  dCards.draw(playingDeck);
  			
  		//Drawing new cards
  		while(true){
  			System.out.println("\n" + "Your Hand:" + pCards.toString() + "\n");
  			System.out.println("Your hand value: " + pCards.cardsValue() + "\n");
  				
  			System.out.println("Dealer Hand: " + dCards.getCard(0).toString() + " and *unknown*" + "\n");
  				
  			System.out.println("Would you like to Hit [type 1] or Stand [type 2]");
  			int response = bet.nextInt();	
        
  			//Program for hit
  			if(response == 1){
  				pCards.draw(playingDeck);
  				System.out.println("\n" + "You draw a:" + pCards.getCard(pCards.deckSize()-1).toString());  
          
  				//Program for bust
  				if(pCards.cardsValue() > 21){
  					System.out.println("Bust. Currently valued at: " + pCards.cardsValue());
  					playerMoney -= playerBet;
  					finish = true;
  					break;
  				}
  			}
  				
  			//If player choses stand
  			if(response == 2){
  				break;
  			}		
  		}
  				
  		System.out.println("\n" + "Dealer Cards:" + dCards.toString());
      
  		//See if dealer has more points than player
  		if((dCards.cardsValue() > pCards.cardsValue())&&finish == false){
  			System.out.println("\n" + "Dealer beats you " + dCards.cardsValue() + " to " + pCards.cardsValue());
  			playerMoney -= playerBet;
  			finish = true;
  		}
      
  		//Dealer hits at 16 stands at 17
  		while((dCards.cardsValue() < 17) && finish == false){
  			dCards.draw(playingDeck);
  			System.out.println("Dealer draws: " + dCards.getCard(dCards.deckSize()-1).toString());
  		}
      
 			System.out.println("\n" + "Dealers hand value: " + dCards.cardsValue());
      
      //Below is the programs for the wins and losses
  		//dealer busted
  		if((dCards.cardsValue()>21)&& finish == false){
  			System.out.println("\n" + "Dealer Busts. You win!");
				playerMoney += playerBet;
 				finish = true;
      }
  		//Tie
  		if((dCards.cardsValue() == pCards.cardsValue()) && finish == false){
				System.out.println("Tie.");
				finish = true;
 			}
  		//Player wins
  		if((pCards.cardsValue() > dCards.cardsValue()) && finish == false){
  			System.out.println("\n" + "You Win!");
  			playerMoney += playerBet;
				finish = true;
  		}
      //Dealer wins
			else if(finish == false){
				System.out.println("\n" + "You Lose.");
 				playerMoney -= playerBet;
 			}
  
  		//End of hand - put cards back in deck
  		pCards.moveAllToDeck(playingDeck);
  		dCards.moveAllToDeck(playingDeck);	
		}

		System.out.println("\n" + "Goodbye.");
		
		//Close Scanner
		bet.close();
	}
}