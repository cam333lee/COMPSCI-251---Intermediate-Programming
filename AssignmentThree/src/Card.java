public class Card {
	
	//instance variables
	private String suit;
	private String rank;
	private String card;
	
	
	private String[] myRank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] mySuits = {"C", "S", "H", "D"};
	//constructor
	
		//default
	public Card() {
		//FIX 
		this("C", "A");
	}
	//accessor for suit and rank
		//mutator suit and rank
	//specifying constructor?
	public Card(String suit, String rank) {
		this.suit=suit;
		this.rank=rank;
		//Checking if there is a mapping of the Rank given
//		for(int i = 0; i < myRank.length; ++i) {
//			if(Suit == myRank[i]) {
//				this.suit = Suit;	
//			}
//		}
//		
//		//Checking if there is a mapping of the Suit given
//		for(int j = 0; j < mySuits.length; ++j) {
//			if(Rank == mySuits[j]) {
//				this.rank = Rank;
//			}
//		}
		 
		
		//creating local variable to hold string value 
		//String cardString = new String();
//		int rankRemainder;
//		int suitRemainder;
//		
//		if(rank <= myRank.length - 1) {
//			//cardString = myRank[card] + "" + mySuits[0];	
//			this.rank = myRank[card];
//			this.suit = mySuits[0];
//		} else {
//			rankRemainder = card % myRank.length;
//			suitRemainder = card / myRank.length;  
//			//cardString = myRank[rankRemainder] + "" + mySuits[suitRemainder];
//			
//			//Setting the this. 
//			this.rank = myRank[rankRemainder];
//			this.suit = mySuits[suitRemainder];
//		}
		
		//this.card = cardString;
	}
	
	public String getSuit() {
		
		return this.suit;
	}
	
	public String getStringRank() {
		return this.rank;
	}
	
	public String getCard() {
		return this.card;
	}
	
	private void setSuit(String suit) {
		if(suit.equals("C") || suit.equals("S") || suit.equals("H") || suit.equals("D")){
			this.suit = suit;
		}	
	}
	
	private void setRank(String Rank) {
		//if(rank.equals >= 2)
		this.rank = Rank;
	}
	
//	public void setCard(String Suit, String Rank) {
//		
//		//Checking if there is a mapping of the Rank given
//		for(int i = 0; i < myRank.length; ++i) {
//			if(Suit == myRank[i]) {
//				this.suit = Suit;	
//			}
//		}
//		
//		//Checking if there is a mapping of the Suit given
//		for(int j = 0; j < mySuits.length; ++j) {
//			if(Rank == mySuits[j]) {
//				this.rank = Rank;
//			}
//		}	
//	}
	
	public Card clone() {
		Card cloneCard = new Card();
		cloneCard.suit = this.suit;
		cloneCard.rank = this.rank;
		return cloneCard;
	}
	
	public boolean equals(Card guest) {
		
		if(guest.rank == this.rank && guest.suit == this.suit) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Card's Rank: " + this.rank + "\nCard's Suit: " + this.suit + "\n"; 
	}	
	
}
