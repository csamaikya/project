
public class Cards {
	 
	int suit;
	int rank;
	public Cards (int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	public static void printCard (Cards c) { 
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	System.out.println (ranks[c.rank] + " of " + suits[c.suit]);
	}
	public static void printDeck (Cards[] deck) { 
		for (int i=0; i<deck.length; i++) {
			printCard (deck[i]); 
			}
		} 
	public static void main(String args[]){
	Cards[] deck = new Cards [52];
	if (deck[3] == null) { 
		System.out.println ("No cards yet!"); 
		}  
	int index = 0; 
	for (int suit = 0; suit <= 3; suit++) {
		for (int rank = 1; rank <= 13; rank++) {
		deck[index] = new Cards (suit, rank); 
		index++;
		}
		}
	}
} 