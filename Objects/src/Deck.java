
public class Deck {
	Card[] cards;
	public Deck (int n) { 
		cards = new Card[n];
		}
	public Deck () {
		cards = new Card[52];
		int index = 0; 
		for (int suit = 0; suit <= 5; suit++) {
			for (int rank = 1; rank <=  13; rank++) { 
				cards[index] = new Card (suit, rank); 
				index++;
				}
		}
		} 
	public static void printDeck (Deck deck) { 
		for (int i=0; i<deck.cards.length; i++) {
			Card.printCard (deck.cards[i]);
			}
		} 
	public static void main(String args[]){
		Deck deck = new Deck (); 
	printDeck(deck);	}
}

