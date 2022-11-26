import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Game {
	// starts the game-loop and greets user with a welcome message
	public static void main(String[] args) {
		System.out.println("Welcome to Lucky Card game by Saman Ul Haq!");

		boolean playAnotherRound = true;
		while (playAnotherRound) {
			play();
		}
	}

	// combining the Card class and the Deck class to shuffle and deal created cards
	public static void play() {
		System.out.println("\n------- Playing a game round");
		Deck deck = new Deck();
		deck.shuffleDeck();

		List<Card> cards = deck.drawThreeCards();

		Card card1 = cards.get(0);
		Card card2 = cards.get(1);
		Card card3 = cards.get(2);

		System.out.println(
				"Card 1: " + card1.getSymbol() + " " + card1.getNumber() + " -> Value = " + card1.sumValueOfCard());
		System.out.println(
				"Card 2: " + card2.getSymbol() + " " + card2.getNumber() + " -> Value = " + card2.sumValueOfCard());
		System.out.println(
				"Card 3: " + card3.getSymbol() + " " + card3.getNumber() + " -> Value = " + card3.sumValueOfCard());

		// Checks the sum value of the cards to distinguish win from loss
		if ((card1.sumValueOfCard() < card3.sumValueOfCard() && card3.sumValueOfCard() < card2.sumValueOfCard())
				|| (card1.sumValueOfCard() > card3.sumValueOfCard()
						&& card3.sumValueOfCard() > card2.sumValueOfCard())) {
			System.out.print("\nYou win!\n");
		} else {
			System.out.print("\nYou lose!\n");
		}
		restartGame();
	}

	// Method enables user to replay by pressing enter or quit game by pressing q/Q after each round
	public static void restartGame() {
		System.out.print("\n=========> Press Enter to play again or \"q\" to quit:");
		Scanner restartAnswer = new Scanner(System.in);
		String yesOrNo;
		yesOrNo = restartAnswer.nextLine().toLowerCase();

		while (true) {
			if (yesOrNo.equals("q")) {
				System.out.print("\nThank you for playing and welcome back!");
				System.exit(0);
			} else if (yesOrNo.equals("")) {
				break;
			} else if (yesOrNo.equalsIgnoreCase(yesOrNo)) {
				restartGame();
				break;
			}
		}
	}
}
