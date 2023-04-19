import java.util.Random;

public class SmartDeck {
	//Instance Array
		private boolean[] deck = new boolean[52];
		private int cardsDealt;
		//Instance Methods
		
		//initDeck
		public void initDeck() {
			for (int i = 0; i <= this.deck.length - 1; i++) {
				this.deck[i] = false; //have not been dealt yet
			}
			this.cardsDealt = 0; //Setting cardsDealt = 0 in initialization
		}
		
		//emptyDeck
		public boolean emptyDeck() { 
			if(this.cardsDealt < 52) {
				return false;
			} else {
				return true;
			}
		}
		
		//dealCard
		public int dealCard() { //returns card at random and
			Random rand = new Random();
			
			int randomCardNum = rand.nextInt(52); //Excludes 52 (Maps from 0-51)	
			 
			if(this.deck[randomCardNum] == false) { //If the random card generated equals false then make that a new card and deal it 
				this.deck[randomCardNum] = true;
				++this.cardsDealt;
				
			} else {
				while(this.deck[randomCardNum] == true) { 
					randomCardNum = rand.nextInt(52);  
				}
				this.deck[randomCardNum] = true;
				++this.cardsDealt;
			}
			
			return randomCardNum;
		}
		
		public static String cardToString(int card) { // 1-1 mapping of the set [0,51] 

			
			String[] myRank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
			String[] mySuits = {"C", "S", "H", "D"};
			
			//creating local variable to hold string value 
			String cardString = new String();

			
			if(card <= myRank.length - 1) {
				cardString = myRank[card] + "" + mySuits[0];
				return cardString;
				
			} else {
				int rankRemainder = card % myRank.length;
				int suitRemainder = card / myRank.length; //rounds down to nearest integer --> Will be used to find what suit 
				cardString = myRank[rankRemainder] + "" + mySuits[suitRemainder];
				return cardString;
			}
		}
}
