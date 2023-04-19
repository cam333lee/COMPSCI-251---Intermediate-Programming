
public class DeckDriver {
	public static void main(String[] args) {
		
		//Instantiating new deck 
		Deck deck = new Deck();
		
		//getting number of cards dealt (Should be 0)
		System.out.println("# of cards dealt before while loop: " + deck.getCardsDealt());
		
		
		//Dealing all cards 
		while(deck.getCardsDealt() <= 51) {
			
			System.out.println("Card #: " + (deck.getCardsDealt() + 1));
			Card card = deck.dealCard();
			System.out.println(card.toString());
			
		}
		
		System.out.println("End of first dealing");
		
		//getting number of cards dealt (Should be 52)
		System.out.println("# of cards dealt after while loop: " + deck.getCardsDealt());
		
		//collect all cards (now they are mixed)
		//sets the # of cards dealt to 0
		System.out.println("Collecting all the cards and setting it back to 0");
		deck.collectAllCards();
		System.out.println("# of cards dealt after collecting: " + deck.getCardsDealt() + "\n");
		
		//Shuffledeck with no parameter
		deck.shuffleDeck();
			
		//Shuffle the cards with no parameter and show cards 
		System.out.println("Displaying the 100 shuffled deck: ");
		for(int i = 0; i <= 51; ++i) {
			System.out.println("Card #: " + (i+1));
			Card card = deck.dealCard();
			System.out.println(card.toString());
		}
		
		//Shuffle the cards with parameter
		System.out.println("Displaying the 2 shuffled deck: ");
		deck.collectAllCards();
		deck.shuffleDeck(2);
		for(int i = 0; i <= 51; ++i) {
			System.out.println("Card #: " + (i+1));
			Card card = deck.dealCard();
			System.out.println(card.toString());
		}
		
		
		
	}
}

/*
 * OUTPUT
 * # of cards dealt before while loop: 0
Card #: 1
Card's Rank: C
Card's Suit: A

Card #: 2
Card's Rank: C
Card's Suit: 2

Card #: 3
Card's Rank: C
Card's Suit: 3

Card #: 4
Card's Rank: C
Card's Suit: 4

Card #: 5
Card's Rank: C
Card's Suit: 5

Card #: 6
Card's Rank: C
Card's Suit: 6

Card #: 7
Card's Rank: C
Card's Suit: 7

Card #: 8
Card's Rank: C
Card's Suit: 8

Card #: 9
Card's Rank: C
Card's Suit: 9

Card #: 10
Card's Rank: C
Card's Suit: 10

Card #: 11
Card's Rank: C
Card's Suit: J

Card #: 12
Card's Rank: C
Card's Suit: Q

Card #: 13
Card's Rank: C
Card's Suit: K

Card #: 14
Card's Rank: S
Card's Suit: A

Card #: 15
Card's Rank: S
Card's Suit: 2

Card #: 16
Card's Rank: S
Card's Suit: 3

Card #: 17
Card's Rank: S
Card's Suit: 4

Card #: 18
Card's Rank: S
Card's Suit: 5

Card #: 19
Card's Rank: S
Card's Suit: 6

Card #: 20
Card's Rank: S
Card's Suit: 7

Card #: 21
Card's Rank: S
Card's Suit: 8

Card #: 22
Card's Rank: S
Card's Suit: 9

Card #: 23
Card's Rank: S
Card's Suit: 10

Card #: 24
Card's Rank: S
Card's Suit: J

Card #: 25
Card's Rank: S
Card's Suit: Q

Card #: 26
Card's Rank: S
Card's Suit: K

Card #: 27
Card's Rank: H
Card's Suit: A

Card #: 28
Card's Rank: H
Card's Suit: 2

Card #: 29
Card's Rank: H
Card's Suit: 3

Card #: 30
Card's Rank: H
Card's Suit: 4

Card #: 31
Card's Rank: H
Card's Suit: 5

Card #: 32
Card's Rank: H
Card's Suit: 6

Card #: 33
Card's Rank: H
Card's Suit: 7

Card #: 34
Card's Rank: H
Card's Suit: 8

Card #: 35
Card's Rank: H
Card's Suit: 9

Card #: 36
Card's Rank: H
Card's Suit: 10

Card #: 37
Card's Rank: H
Card's Suit: J

Card #: 38
Card's Rank: H
Card's Suit: Q

Card #: 39
Card's Rank: H
Card's Suit: K

Card #: 40
Card's Rank: D
Card's Suit: A

Card #: 41
Card's Rank: D
Card's Suit: 2

Card #: 42
Card's Rank: D
Card's Suit: 3

Card #: 43
Card's Rank: D
Card's Suit: 4

Card #: 44
Card's Rank: D
Card's Suit: 5

Card #: 45
Card's Rank: D
Card's Suit: 6

Card #: 46
Card's Rank: D
Card's Suit: 7

Card #: 47
Card's Rank: D
Card's Suit: 8

Card #: 48
Card's Rank: D
Card's Suit: 9

Card #: 49
Card's Rank: D
Card's Suit: 10

Card #: 50
Card's Rank: D
Card's Suit: J

Card #: 51
Card's Rank: D
Card's Suit: Q

Card #: 52
Card's Rank: D
Card's Suit: K

End of first dealing
# of cards dealt after while loop: 52
Collecting all the cards and setting it back to 0
# of cards dealt after collecting: 0

Displaying the 100 shuffled deck: 
Card #: 1
Card's Rank: D
Card's Suit: 5

Card #: 2
Card's Rank: C
Card's Suit: 3

Card #: 3
Card's Rank: D
Card's Suit: 9

Card #: 4
Card's Rank: D
Card's Suit: 2

Card #: 5
Card's Rank: S
Card's Suit: 3

Card #: 6
Card's Rank: S
Card's Suit: 6

Card #: 7
Card's Rank: C
Card's Suit: 2

Card #: 8
Card's Rank: H
Card's Suit: 6

Card #: 9
Card's Rank: C
Card's Suit: A

Card #: 10
Card's Rank: S
Card's Suit: 10

Card #: 11
Card's Rank: C
Card's Suit: J

Card #: 12
Card's Rank: H
Card's Suit: 8

Card #: 13
Card's Rank: C
Card's Suit: 10

Card #: 14
Card's Rank: S
Card's Suit: K

Card #: 15
Card's Rank: H
Card's Suit: 3

Card #: 16
Card's Rank: S
Card's Suit: 9

Card #: 17
Card's Rank: S
Card's Suit: J

Card #: 18
Card's Rank: H
Card's Suit: Q

Card #: 19
Card's Rank: H
Card's Suit: 5

Card #: 20
Card's Rank: D
Card's Suit: 3

Card #: 21
Card's Rank: S
Card's Suit: A

Card #: 22
Card's Rank: C
Card's Suit: 9

Card #: 23
Card's Rank: C
Card's Suit: 4

Card #: 24
Card's Rank: D
Card's Suit: Q

Card #: 25
Card's Rank: C
Card's Suit: K

Card #: 26
Card's Rank: D
Card's Suit: J

Card #: 27
Card's Rank: H
Card's Suit: J

Card #: 28
Card's Rank: S
Card's Suit: 7

Card #: 29
Card's Rank: C
Card's Suit: Q

Card #: 30
Card's Rank: S
Card's Suit: 4

Card #: 31
Card's Rank: C
Card's Suit: 6

Card #: 32
Card's Rank: H
Card's Suit: 7

Card #: 33
Card's Rank: D
Card's Suit: 6

Card #: 34
Card's Rank: D
Card's Suit: A

Card #: 35
Card's Rank: H
Card's Suit: K

Card #: 36
Card's Rank: H
Card's Suit: 10

Card #: 37
Card's Rank: D
Card's Suit: 10

Card #: 38
Card's Rank: C
Card's Suit: 5

Card #: 39
Card's Rank: H
Card's Suit: A

Card #: 40
Card's Rank: D
Card's Suit: 4

Card #: 41
Card's Rank: C
Card's Suit: 7

Card #: 42
Card's Rank: C
Card's Suit: 8

Card #: 43
Card's Rank: H
Card's Suit: 9

Card #: 44
Card's Rank: H
Card's Suit: 2

Card #: 45
Card's Rank: D
Card's Suit: 8

Card #: 46
Card's Rank: D
Card's Suit: 7

Card #: 47
Card's Rank: S
Card's Suit: 8

Card #: 48
Card's Rank: S
Card's Suit: 5

Card #: 49
Card's Rank: H
Card's Suit: 4

Card #: 50
Card's Rank: S
Card's Suit: Q

Card #: 51
Card's Rank: S
Card's Suit: 2

Card #: 52
Card's Rank: D
Card's Suit: K

Displaying the 2 shuffled deck: 
Card #: 1
Card's Rank: D
Card's Suit: 5

Card #: 2
Card's Rank: C
Card's Suit: 3

Card #: 3
Card's Rank: D
Card's Suit: 9

Card #: 4
Card's Rank: C
Card's Suit: 2

Card #: 5
Card's Rank: S
Card's Suit: 3

Card #: 6
Card's Rank: S
Card's Suit: 6

Card #: 7
Card's Rank: D
Card's Suit: 2

Card #: 8
Card's Rank: H
Card's Suit: 6

Card #: 9
Card's Rank: C
Card's Suit: A

Card #: 10
Card's Rank: S
Card's Suit: 10

Card #: 11
Card's Rank: C
Card's Suit: J

Card #: 12
Card's Rank: H
Card's Suit: 8

Card #: 13
Card's Rank: C
Card's Suit: 10

Card #: 14
Card's Rank: S
Card's Suit: K

Card #: 15
Card's Rank: H
Card's Suit: 3

Card #: 16
Card's Rank: S
Card's Suit: 9

Card #: 17
Card's Rank: S
Card's Suit: J

Card #: 18
Card's Rank: H
Card's Suit: Q

Card #: 19
Card's Rank: H
Card's Suit: 5

Card #: 20
Card's Rank: D
Card's Suit: 3

Card #: 21
Card's Rank: S
Card's Suit: A

Card #: 22
Card's Rank: C
Card's Suit: 9

Card #: 23
Card's Rank: C
Card's Suit: 4

Card #: 24
Card's Rank: D
Card's Suit: Q

Card #: 25
Card's Rank: C
Card's Suit: K

Card #: 26
Card's Rank: D
Card's Suit: J

Card #: 27
Card's Rank: H
Card's Suit: J

Card #: 28
Card's Rank: S
Card's Suit: 7

Card #: 29
Card's Rank: C
Card's Suit: Q

Card #: 30
Card's Rank: S
Card's Suit: 4

Card #: 31
Card's Rank: C
Card's Suit: 6

Card #: 32
Card's Rank: H
Card's Suit: 7

Card #: 33
Card's Rank: D
Card's Suit: 6

Card #: 34
Card's Rank: D
Card's Suit: A

Card #: 35
Card's Rank: H
Card's Suit: K

Card #: 36
Card's Rank: H
Card's Suit: 10

Card #: 37
Card's Rank: D
Card's Suit: 10

Card #: 38
Card's Rank: C
Card's Suit: 5

Card #: 39
Card's Rank: H
Card's Suit: A

Card #: 40
Card's Rank: D
Card's Suit: 4

Card #: 41
Card's Rank: C
Card's Suit: 7

Card #: 42
Card's Rank: C
Card's Suit: 8

Card #: 43
Card's Rank: H
Card's Suit: 9

Card #: 44
Card's Rank: H
Card's Suit: 2

Card #: 45
Card's Rank: D
Card's Suit: 8

Card #: 46
Card's Rank: D
Card's Suit: 7

Card #: 47
Card's Rank: S
Card's Suit: 8

Card #: 48
Card's Rank: S
Card's Suit: 5

Card #: 49
Card's Rank: H
Card's Suit: 4

Card #: 50
Card's Rank: S
Card's Suit: Q

Card #: 51
Card's Rank: S
Card's Suit: 2

Card #: 52
Card's Rank: D
Card's Suit: K
*/
