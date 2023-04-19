import java.util.Random;

public class CardDriver {

	public static void main(String[] args) {
		
		boolean[] myDeck = new boolean[52]; //Create a true/false array to determine whether the deck has been dealt
		
		
		final int cardsPerRow = 8;
		int cardsThisRow = 0;
		int myCard;
		initDeck(myDeck);
		
		System.out.println("\nHere is a shuffled deck ...\n");
		while (!emptyDeck(myDeck))
		{
		myCard = dealCard(myDeck);
		++cardsThisRow;
			if (cardsThisRow <= cardsPerRow) {
				printCard(myCard);
				System.out.print(" ");
			}
			else
			{
				System.out.println("");
				cardsThisRow = 1;
				printCard(myCard);
				System.out.print(" ");
			}
		}
		System.out.println('\n');
	
	}
	
	//Loop through every element in the array and set it to false
	//to show that none of them have been dealt yet
	public static void initDeck(boolean[] deck) {
		for (int i = 0; i <= deck.length - 1; i++) {
			deck[i] = false; //have not been dealt yet
		}
	}

	// Loop through all elements in the array to check whether all of the cards
	// have been dealt yet
	// Used an if statement to see if there is a false
	// if false
	// return false
	// Otherwise return true

	public static boolean emptyDeck(boolean[] deck) { 
		for (int i = 0; i <= deck.length - 1; i++) { 
			  if (deck[i] == false) { 
				  return false; //Not all cards have been dealt
			  }
		}
	   return true; //All cards have been dealt 
	}

	public static int dealCard(boolean[] deck) { //returns card at random and
		Random rand = new Random();
		
		int randomCardNum = rand.nextInt(52);		
	
		if(deck[randomCardNum] == false) { //If the random card generated equals false then make that a new card and deal it 
			deck[randomCardNum] = true;
			//System.out.print(randomCardNum + " ");
			
		} else {
			while(deck[randomCardNum] == true) {
				randomCardNum = rand.nextInt(52);
			}
			//System.out.print(randomCardNum + " ");
			deck[randomCardNum] = true;
		}
					
		/*
		 *Every times it enters the method, there needs to be a way to check if the number was previously used or not
		 *For the first time the method is entered, there will be no true value
		 *
		*/
		
		
		return randomCardNum;
	}

	public static void printCard(int card) { // 1-1 mapping of the set [0,51] }
		//System.out.print("Entered the printCard function");
		
		//for loop for ranks
			//for loop for suits
		
		String[] myRank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] mySuits = {"C", "S", "H", "D"};
		
		if(card <= myRank.length - 1) {
			System.out.print(myRank[card] + "" + mySuits[0]);
		} else {
			int rankRemainder = card % myRank.length;
			int suitRemainder = card / myRank.length; //rounds down to nearest integer --> Will be used to find what suit 
			
			System.out.print(myRank[rankRemainder] + "" + mySuits[suitRemainder]);
		}
	}
}

/* Check for method one
		initDeck(myDeck);
		for (int i = 0; i <= myDeck.length - 1; i++) {
			System.out.println(myDeck[i] + "" + i);
		}
*/	
	
	