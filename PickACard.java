class Card {
	int value;
	String suit;
	String name;
	
	public String toString(){ //<--changes record to String
		return name + " of " + suit;
	} //^method inside record, doesn't need parameters==method, != function
}

public class PickACard{
	public static void main( String[] args ){
		Card[] deck = buildDeck();
		//displayDeck(deck);
		shuffleDeck(deck);
		
		int chosen = (int)(Math.random()*deck.length);
		Card picked = deck[chosen];
				
		System.out.println("You picked a " + picked + " out of the deck,");
		System.out.println("worth " + picked.value + " points in Blackjack.");
	}
	
	public static Card[] buildDeck() {
		String[] suits = {"clubs", "diamonds", "hearts", "spades" };
		String[] names = {"ZERO", "ONE", "two", "three", "four", "five", "six", "seven", "eight",
		"nine", "ten", "Jack", "Queen", "King", "Ace" };
		//ZERO AND ONE just fill [0] and [1] in array
		int i = 0;
		Card [] deck = new Card[52];
		
		for (String s: suits){//<--for each suit in array suits
			for (int v = 2 ; v <= 14 ; v++ ){
				Card c = new Card();
				c.suit = s;
				c.name = names[v];
				if ( v==14)
					c.value = 11;//b/c ace is worth 11
				else if(v > 10)
					c.value = 10;//b/c face cards are worth 10
				else
					c.value = v;
					
				deck[i] = c;
				i++;
			}
		}
		return deck;
	}
	
	public static void displayDeck (Card[] deck){
		for (Card c : deck ) //<--for each card c in array deck
			System.out.println(c.value + "\t" + c);
	}
	
	public static void shuffleDeck (Card[] deck){
		int [] onTable = new int [52];
		for (int i = 0; i <= 51; i = i){
			int k = (int)(Math.random()*deck.length);
			System.out.println(deck[k]);
			k = onTable[i];
			for (int p : onTable){
				if (p == k){
					continue;
				}
			}
			i++;
		}
	}
	
}