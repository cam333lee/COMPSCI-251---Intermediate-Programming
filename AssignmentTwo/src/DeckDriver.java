public class DeckDriver {
	public static void main(String[] args) {
		
		//Create + Instantiate deck
		Deck myDeck = new Deck();
		
		final int cardsPerRowDeck = 8;
		int cardsThisRowDeck = 0;
		int myCardDeck;
		
		System.out.println("Run 1: - With Deck Class -");
		myDeck.initDeck();
		System.out.println("\nHere is a shuffled regular deck ...\n");
		while (!myDeck.emptyDeck())
		{
			myCardDeck = myDeck.dealCard();
			++cardsThisRowDeck;
			if (cardsThisRowDeck <= cardsPerRowDeck) {
				System.out.print(Deck.cardToString(myCardDeck));
//Wants me to enter the static field in a static way (essentially should call the class I guess?) Ask Jaya.)
				System.out.print(" ");
			}
			else
			{
				System.out.println("");
				cardsThisRowDeck = 1;
				System.out.print(Deck.cardToString(myCardDeck));
				System.out.print(" ");
			}
		}
		System.out.println('\n');
		System.out.println("---------------------------------------");
		
//----------------------------------------------------------------------------------		
		System.out.println("Run 2: - With SmartDeck Class -");
		//Create + Instantiate Smart Deck
		SmartDeck mySmartDeck = new SmartDeck();
		
		final int cardsPerRowSmartDeck = 8;
		int cardsThisRowSmartDeck = 0;
		int myCardSmartDeck;
		
		mySmartDeck.initDeck();
		
		System.out.println("\nHere is a shuffled smart deck ...\n");
		while (!mySmartDeck.emptyDeck())
		{
			myCardSmartDeck = mySmartDeck.dealCard();
			++cardsThisRowSmartDeck;
			if (cardsThisRowSmartDeck <= cardsPerRowSmartDeck) {
				System.out.print(SmartDeck.cardToString(myCardSmartDeck));
				System.out.print(" ");
			}
			else
			{
				System.out.println("");
				cardsThisRowSmartDeck = 1;
				System.out.print(SmartDeck.cardToString(myCardSmartDeck));
				System.out.print(" ");
			}
		
	
		}
	}
}


/*
OUTPUT #1:
Run 1: - With Deck Class -

Here is a shuffled regular deck ...

10S AH 5C AS 7C KS 5H 9S 
3H JC 8C QC 8H JH 2D 3S 
KD 2H AD 10C JS 4H KC 6D 
QS QD 8D 4D 6H 6C 5S 9C 
4C 10H 3D 6S 4S QH AC 8S 
5D JD 9H 7H KH 10D 7S 3C 
7D 2C 9D 2S 

---------------------------------------
Run 2: - With SmartDeck Class -

Here is a shuffled smart deck ...

6C 3H 9C 8C 4C 10S 10C 6S 
3S JC KS 7C 3D 9S 9D QS 
JS JD KD 8S QH 8H AH 4S 
7H 6H 10H KH 8D QD 6D 5D 
5S 7D 7S 2C 5H AD 2H 9H 
QC 3C AS 2D JH 5C KC 2S 
10D AC 4D 4H 



OUTPUT #2:
Run 1: - With Deck Class -

Here is a shuffled regular deck ...

5C AD 8H 9H KD 10H 8C 2C 
JD 6H 8D 3D KS JC JH 8S 
10C QD 6D 3S 4C 9D 2S 5D 
AS AC 7D JS 4H 3H KC 5H 
10D 2H 4S KH 3C 6C 9S QH 
7C 6S 4D AH QS 9C 7H 10S 
QC 5S 7S 2D 

---------------------------------------
Run 2: - With SmartDeck Class -

Here is a shuffled smart deck ...

10H 4C KH 7H AD AH 10C QC 
5H 5D 3S 9S KS JS JH 2H 
6H 2D 7C QS KD 5C 9C 2S 
QH 4S 9H 3H 10D KC 8D 3D 
QD 2C 9D 8C AS 5S 6D 10S 
6S 4H AC JD JC 7D 6C 7S 
4D 8S 3C 8H 

*/