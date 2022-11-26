public class Card {

	private String cardNumber;
	private String cardSymbol;
	private int numValue;
	private int symbolValue;

	// create constructor
	public Card(String cardNumber, String cardSymbol) {
		this.cardNumber = cardNumber;
		this.cardSymbol = cardSymbol;
		this.numValue = numberValue();
		this.symbolValue = suitValue();
	}

	// Get the card and their appearance to read value
	public String getNumber() {
		return this.cardNumber;
	}

	public String getSymbol() {
		return this.cardSymbol;
	}

	// compare the created values with the value of the dealt card
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card) {
			Card that = (Card) obj;
			if (that.cardNumber.equals(this.cardNumber) && that.cardSymbol.equals(this.cardSymbol)) {
				return true;
			}
		}
		return false;
	}

	// To assign values to numbers and suits
	// Assigns value to the numbers
	public int numberValue() {
		switch (this.cardNumber) {
		case "1":
			numValue = 1;
			break;

		case "2":
			numValue = 2;
			break;

		case "3":
			numValue = 3;
			break;

		case "4":
			numValue = 4;
			break;

		case "5":
			numValue = 5;
			break;

		case "6":
			numValue = 6;
			break;

		case "7":
			numValue = 7;
			break;

		case "8":
			numValue = 8;
			break;

		case "9":
			numValue = 9;
			break;

		case "10":
			numValue = 10;
			break;

		case "11":
			numValue = 11;
			break;

		case "12":
			numValue = 12;
			break;

		case "13":
			numValue = 13;
			break;
		}
		return numValue;
	}

	// Gives a numeric value to the suits
	public int suitValue() {
		switch (this.cardSymbol) {

		case "Spades":
			symbolValue = 10;
			break;

		case "Hearts":
			symbolValue = 8;
			break;

		case "Clubs":
			symbolValue = 6;
			break;

		case "Diamonds":
			symbolValue = 4;
			break;

		}
		return symbolValue;
	}

	public int sumValueOfCard() {
		return numValue + symbolValue;
	}

}
