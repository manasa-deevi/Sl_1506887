package ex1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		int randomNum = random.nextInt(1000);
		Scanner scanner = new Scanner(System.in);
		System.out.println(randomNum);
		System.out.println("Guess a number and enter");

		while (randomNum >= 0) {

			int userguess = scanner.nextInt();
			if (userguess < randomNum) {
				System.out.println("Your Guessed value is too low");
				break;
			} else if (userguess > randomNum) {
				System.out.println("Your Guessed value is too high");
				break;
			} else {
				System.out.println("Your guess is correct");
				break;
			}

		}
		scanner.close();

	}
}
