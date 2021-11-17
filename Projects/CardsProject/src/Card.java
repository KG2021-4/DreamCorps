public class Card {

	private final int rank;

	private final int suit;

	/**
	 * Constructs a card of the given rank and suit.
	 */
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	  public boolean equals(Card that) {
	        return this.rank == that.rank
	            && this.suit == that.suit;
	    }
	

	/**
	 * Returns the card's index in a sorted deck of 52 cards.
	 */
//	public int position() {
//		return this.suit * 13 + this.rank - 1;
//	}
	
	  public String toString() {

			String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

			String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
			return ranks[this.rank] + " of " + suits[this.suit];
		}

	
}