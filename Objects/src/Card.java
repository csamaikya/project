
public class Card {
		int suit;
		static int rank;
		public Card () { 
			this.suit = 0;
			this.rank = 0; 
			}
		public Card (int suit, int rank) {
			this.suit = suit;
			this.rank = rank;
			}
		public static void printCard (Card c) { 
			String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
			String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		System.out.println (ranks[c.rank] + " of " + suits[c.suit]);
		}
		public static boolean sameCard (Card c3, Card c4 ){
			
			return (c3.suit == c4.suit && c3.rank == c4.rank); 
			} 
		public static  int compareCard(Card c1,Card c2){
			if (c1.suit > c2.suit) 
				return 1; 
			if (c1.suit < c2.suit)
				return -1;
		
			if (c1.rank > c2.rank) 
				return 1;
			if (c1.rank < c2.rank) 
				return -1; 
			return rank;
				
		}
		public static void main(String args[]){
			Card card = new Card (1, 11);
			printCard (card); 
			Card card1 = new Card (1, 11);
			Card card2 = card1;
			Card c1= new Card(2,11);
			Card c2= new Card(1,12);
			if (card1 == card2) { 
				System.out.println ("card1 and card2 are the same object."); } 
			Card card3 = new Card (1, 11);
			Card card4 = new Card (1, 11);
			if (sameCard (card3, card4)) { 
				System.out.println ("card3 and card4 are the same card."); }
			System.out.println(compareCard(c1,c2));
		}
		}


