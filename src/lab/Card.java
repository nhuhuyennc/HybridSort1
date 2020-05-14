package lab;

/**
 * Aufgabe H1a)
 * 
 * Abgabe von: <name>, <name> und <name>
 */

public class Card {
	
	// DO NOT MODIFY
	public enum Suit {
		Hearts, Diamonds, Clubs, Spades
	}
	
	// DO NOT MODIFY
	public int value;
	public Suit suit;
	
	// DO NOT MODIFY
	public Card() {
	}
	
	// DO NOT MODIFY
	/**
	 * Initialize a Card with a suit and a value
	 */
	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	// DO NOT MODIFY
	/**
	 * Create a new card from an existing card
	 */
	public Card(Card other) {
		this.value = other.value;
		this.suit = other.suit;
	}
	
	/**
	 * Return a printable representation of the card
	 */
	public String toString() {
		return value+";"+suit;
	}
	
	/**
	 * Compare two card objects. Return -1 if this is deemed smaller than the object other, 0 if they are
	 * deemed of identical value, and 1 if this is deemed greater than the object other.
	 * @param other The object we compare this to.
	 * @return -1, 0 or 1
	 */
	
	public int compareTo(Card other) {
		// TODO: implement
		
		if (this.value > other.value) {
			return 1;
		}
		if (this.value == other.value) {
			if (this.suit == other.suit) {
				return 0;
			}
			else {
				if (this.suit == Suit.Diamonds) {
					if (other.suit != Suit.Diamonds) {
						return -1;
					}
				}
				if (this.suit == Suit.Clubs) {
					if (other.suit != Suit.Clubs) {
						return 1;
					}
				}
				if (this.suit == Suit.Hearts) {
					if (other.suit == Suit.Diamonds) {
						return 1;
					}
					if (other.suit == Suit.Spades || other.suit == Suit.Clubs) {
						return -1;
					}
				}
				if (this.suit == Suit.Spades) {
					if (other.suit == Suit.Diamonds || other.suit == Suit.Hearts) {
						return 1;
					}
					if (other.suit == Suit.Clubs) {
						return-1;
					}
				}
				
			}
			
		}
		
		return -1;
		
}
	
	
	
	
	
	
}
		
			