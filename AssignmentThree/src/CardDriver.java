import java.util.Random;

public class CardDriver {
	public static void main(String[] args) {
		
		Card[] myDeck = new Card[52]; //Declare an array of cards
		
		for(int i = 0; i <= myDeck.length - 1; i++) {
			//At each element of myDeck, initialize a new card object with the index value
			//to obtain the pairing of suit and rank 
			myDeck[i] = new Card(i);
			System.out.println(myDeck[i].getCard());
		}
		
		Card equalsCard = new Card(5);
		
		System.out.println("\n\n" + myDeck[5].getCard());
		System.out.println(equalsCard.getCard());
		
		if(myDeck[5].equals(equalsCard)) {
			System.out.println("They are equal.");
		} else {
			System.out.println("They are NOT equal.");
		}
		
		System.out.println("\n\n" + myDeck[6].getCard());
		System.out.println(equalsCard.getCard());
		
		if(myDeck[6].equals(equalsCard)) {
			System.out.println("They are equal.");
		} else {
			System.out.println("They are NOT equal.");
		}
		System.out.println("");
		//Trying toString
		myDeck[5].toString();
		
		//Applying transpositions
		int count = 0;
		while(count < 100) {
			Random random1 = new Random();
			Random random2 = new Random();

			int randomInt1 = random1.nextInt(0,51);
			int randomInt2 = random2.nextInt(0,51);
			
			Card temp;
			temp = myDeck[randomInt1];
			myDeck[randomInt1] = myDeck[randomInt2];
			myDeck[randomInt2] = temp;			
			++count;
		}
		
		//Swap & Queen of Clubs Location
		int qCLocation = 0;
		
		for(int i = 0; i <= myDeck.length - 1; ++i) {
			System.out.println(myDeck[i].getCard());
			
			if(myDeck[i].getCard().equals("QC")) {
				qCLocation = i;
			}
		}
		
		System.out.println("The queen of hearts can be found at index: " + qCLocation);		
	}	
}


/*OUTPUT #1
 * 
 * AC
2C
3C
4C
5C
6C
7C
8C
9C
10C
JC
QC
KC
AS
2S
3S
4S
5S
6S
7S
8S
9S
10S
JS
QS
KS
AH
2H
3H
4H
5H
6H
7H
8H
9H
10H
JH
QH
KH
AD
2D
3D
4D
5D
6D
7D
8D
9D
10D
JD
QD
KD


6C
6C
They are equal.


7C
6C
They are NOT equal.

5C
9S
8S
8C
3H
JH
QD
9D
QS
4C
3D
10D
JC
JS
2D
9C
9H
AS
7S
8H
7D
10S
6S
10C
5H
4H
AH
5D
7H
2H
4S
AD
QH
7C
KS
2S
6H
8D
JD
QC
5S
2C
AC
KC
3C
4D
3S
KH
6C
6D
10H
KD
The queen of hearts can be found at index: 39

OUTPUT #2:
AC
2C
3C
4C
5C
6C
7C
8C
9C
10C
JC
QC
KC
AS
2S
3S
4S
5S
6S
7S
8S
9S
10S
JS
QS
KS
AH
2H
3H
4H
5H
6H
7H
8H
9H
10H
JH
QH
KH
AD
2D
3D
4D
5D
6D
7D
8D
9D
10D
JD
QD
KD


6C
6C
They are equal.


7C
6C
They are NOT equal.

QH
2C
KH
3D
JS
8D
9H
8C
4S
6C
KS
6D
10C
9D
4D
10H
6H
2S
3H
JD
JH
4C
9S
2H
5D
7H
5S
3S
QC
5H
AD
10D
6S
5C
9C
KC
3C
JC
QD
7C
4H
7S
AC
8S
10S
7D
8H
2D
QS
AS
AH
KD
The queen of hearts can be found at index: 28

*/