import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// arrays of total variations of cards
	private String[] cardNumber = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
	private String[] cardSymbol = { "Spades", "Hearts", "Clubs", "Diamonds" };

	// ArrayList with the cards
	private ArrayList<Card> cards;

	// Constructor that builds the deck containing 52 cards
	public Deck() {
		cards = new ArrayList<>();

		// Nested loops for each card, to create each card
		for (String symbol : cardSymbol) {
			for (String number : cardNumber) {
				// Instantiating card
				Card card = new Card(number, symbol);
				// adding cards to the deck
				cards.add(card);
			}
		}
	}

	// Shuffles the 52 cards in the deck
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	// Create a new list to draw three cards from the deck
	public List<Card> drawThreeCards() {
		List<Card> drawCard = new ArrayList<>();
		for (int i = 0; i <= 2; i++) {
			drawCard.add(cards.get(i));
		}
		return drawCard;
	}

}
