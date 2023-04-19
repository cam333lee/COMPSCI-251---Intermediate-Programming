import java.util.Random;

public class Deck {
	//Instance Array
	private boolean[] deck = new boolean[52];
	
	//Instance Methods
	
	//initDeck
	public void initDeck() {
		for (int i = 0; i <= this.deck.length - 1; i++) {
			this.deck[i] = false; //have not been dealt yet
		}
	}
	
	//emptyDeck
	public boolean emptyDeck() { 
		for (int i = 0; i <= this.deck.length - 1; i++) { 
			  if (this.deck[i] == false) { 
				  return false; //Not all cards have been dealt
			  }
		}
	   return true; //All cards have been dealt 
	}
	
	//dealCard
	public int dealCard() { //returns card at random and
		Random rand = new Random();
		
		int randomCardNum = rand.nextInt(52); //Excludes 52 (Maps from 0-51)	
	
		if(this.deck[randomCardNum] == false) { //If the random card generated equals false then make that a new card and deal it 
			this.deck[randomCardNum] = true;
			//System.out.print(randomCardNum + " "); Check 
			
		} else {
			while(this.deck[randomCardNum] == true) { //while random number has corresponding card dealt already 
				randomCardNum = rand.nextInt(52); //keep looping 
			}
			//System.out.print(randomCardNum + " "); Check
			this.deck[randomCardNum] = true;
		}		
		
		return randomCardNum;
	}
	
	public static String cardToString(int card) {  

		
		String[] myRank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] mySuits = {"C", "S", "H", "D"};
		
		//creating local variable to hold string value 
		String cardString = new String();

		
		if(card <= myRank.length - 1) {
			cardString = myRank[card] + "" + mySuits[0];
			return cardString;
			
		} else {
			int rankRemainder = card % myRank.length;
			int suitRemainder = card / myRank.length;  
			cardString = myRank[rankRemainder] + "" + mySuits[suitRemainder];
			return cardString;
		}
	}
	
}

