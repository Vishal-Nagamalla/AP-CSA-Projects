import java.util.ArrayList;
import java.util.Random;
public class Deck {
  //Create a ArrayList for the diffrent cards
	private ArrayList<Card> cards;
  
	public Deck(){
		this.cards = new ArrayList<Card>();
	}

  //Method to make deck
	public void createFullDeck(){
		for(Suit cardSuit : Suit.values()){
			for(Value cardValue : Value.values()){
				this.cards.add(new Card(cardSuit,cardValue));
			}
		}
	}
	
  public void shuffle(){
  	//Create a new arraylist to hold the shuffled cards temporarily
  	ArrayList<Card> tmpDeck = new ArrayList<Card>();
  	//Randomly pick from the old deck and copy values to the temprary deck
    //Temp deck used so cards don't get lost or repeated
  	Random random = new Random();
  	int randomCardIndex = 0;
  	int originalSize = this.cards.size();
  	for(int i = 0; i<originalSize;i++){
  		randomCardIndex = random.nextInt((this.cards.size()-1 - 0) + 1) + 0;
  		tmpDeck.add(this.cards.get(randomCardIndex));
  		//remove drawn card fom deck so cards don't repeat
  		this.cards.remove(randomCardIndex);
  	}
  	this.cards = tmpDeck;
  }
	
	//Remove a card from the deck
	public void removeCard(int i){
		this.cards.remove(i);
	}
  
	//Get card from deck
	public Card getCard(int i){
		return this.cards.get(i);
	}
  
	//Add card to deck
	public void addCard(Card addCard){
		this.cards.add(addCard);
	}
  
	public void draw(Deck comingFrom){
		//Add card to this deck from whatever deck its coming from
		this.cards.add(comingFrom.getCard(0));
		//Remove the card in the deck its coming from
		comingFrom.removeCard(0);
	}
	
	//Use to print out deck
	public String toString(){
		String cardListOutput = "";
		int i = 0;
		for(Card aCard : this.cards){
			cardListOutput += "\n" + aCard.toString();
			i++;
		}
		return cardListOutput;
	}
	
	public void moveAllToDeck(Deck moveTo){
		int thisDeckSize = this.cards.size();
		//put cards in moveTo deck
		for(int i = 0; i < thisDeckSize; i++){
			moveTo.addCard(this.getCard(i));
		}
		//empty out the deck
		for(int i = 0; i < thisDeckSize; i++){
			this.removeCard(0);
		}
	}
	
	public int deckSize(){
		return this.cards.size();
	}
	
	//Calculate the value of deck
	public int cardsValue(){
		int num = 0;
    
  //Uses Switch method to convert names into number values
		for(Card aCard : this.cards){
			switch(aCard.getValue()){
			case Two: num += 2; break;
			case Three: num += 3; break;
			case Four: num += 4; break;
			case Five: num += 5; break;
			case Six: num += 6; break;
			case Seven: num += 7; break;
			case Eight: num += 8; break;
			case Nine: num += 9; break;
			case Ten: num += 10; break;
			case Jack: num += 10; break;
			case Queen: num += 10; break;
			case King: num += 10; break;
			case Ace: num += 1; break;
			}			
		}

		return num;
	}
}