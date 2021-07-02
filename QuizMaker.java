package com.techelevator;

import java.util.Locale;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter a file path: ");
		String path = userInput.nextLine();

		System.out.println("What color is the sky?|yellow|blue|green|red");
		String colorChoice = userInput.nextLine();

		if (!colorChoice.equalsIgnoreCase("blue")) {
			System.out.println("Sorry wrong answer!");
		} else {
				System.out.println("Your answer is correct!");
			}
		Scanner newInput = new Scanner(System.in);

		System.out.print("A skeleton walks into a bar, and says to the bartender, \"Give me a beer and a ...\"|hair brush|dry erase marker|mop|yo-yo\n");
		String answer = userInput.nextLine();
		if (!answer.equalsIgnoreCase("mop")) {
			System.out.println("Sorry wrong answer!");
		} else {
			System.out.println("Your answer is correct!");
		}
		}
		}



