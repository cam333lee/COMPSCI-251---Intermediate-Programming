import java.util.Random;

public class Deck {
	
	//Instance variables
	private Card[] deck = new Card[52];
	private int cardsDealt;
	
	private String[] myRank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] mySuits = {"C", "S", "H", "D"};
	
	/*
	 * How to assign a card using suits and ranks
	 * Need to find the number that we are currently on (held by the variable i)
	 * This will allow for the rank to be determined and the suit 
	 */
	
	public Deck() {
		 
		for(int i = 0; i <= deck.length -1; ++i) {
			
			int rankRemainder = 0;
			int suitRemainder = 0;
			//String cardString = new String();
			
			if(i <= myRank.length - 1) {
				rankRemainder = i;
				suitRemainder = 0;
				
				//System.out.println("Rank Remainder: " + rankRemainder + " Suit Remainder: " + suitRemainder);
			} else {
				rankRemainder = i % myRank.length;
				suitRemainder = i / myRank.length;  
				//System.out.println("Rank Remainder: " + rankRemainder + " Suit Remainder: " + suitRemainder);
			}
			
			deck[i] = new Card(myRank[rankRemainder], mySuits[suitRemainder]);
		}
		this.cardsDealt = 0;
	}
	
	//Accessor
	public int getCardsDealt() {
		return this.cardsDealt;
	}
	
	//Mutator
	private void setCardsDealt(int cardsDealt) {
		this.cardsDealt = cardsDealt;
	}
	
	//Check for empty deck
	public boolean isEmptyDeck() {
		if(this.getCardsDealt() == 52) {
			return true;
		}
	
		return false;
	}
	
	//collectAllCards()
	public void collectAllCards() {
		this.cardsDealt = 0;
	}
	
	//deal cards
	public Card dealCard() {
		if(!this.isEmptyDeck()) {
			//System.out.println(deck[this.getCardsDealt()]);
			++this.cardsDealt;
			//System.out.println("Cards Dealt" + this.cardsDealt);
			return deck[this.getCardsDealt() -1 ];
			//returns the card at location cardsDealt in the deck	
		} else {
			return null;
		}	
	}
	
	//shuffles the deck 100 times
	public void shuffleDeck() {	
		shuffleDeck(100);
	}
	
	//Shuffles the deck x amount of times 
	public void shuffleDeck(int swpCnt) {
		
		int swapCount = 0; 
		
		while(swapCount < swpCnt - 1) {
			
			
			Random random1 = new Random();
			Random random2 = new Random();

			int randomInt1 = random1.nextInt(0,51);
			int randomInt2 = random2.nextInt(0,51);
			
			//Printing old swap/checking if legit
		/*	System.out.println("These are the old cards: \n" + deck[randomInt1] + " at index " + randomInt1);
			System.out.println("These are the old cards: \n" + deck[randomInt2] + " at index " + randomInt2);
			System.out.println("");
		 */
			
			Card temp;
			temp = deck[randomInt1];
			deck[randomInt1] = deck[randomInt2];
			deck[randomInt2] = temp;
			
			//Printing new swap/checking if legit
		/*
			System.out.println("These are the new cards: \n" + deck[randomInt1] + " at index " + randomInt1);
			System.out.println("These are the new cards: \n" + deck[randomInt2] + " at index " + randomInt2);
			System.out.println("");
		*/
			++swapCount; //Missed to increment which is why it kept looping 
		}
	}
	
	
}
