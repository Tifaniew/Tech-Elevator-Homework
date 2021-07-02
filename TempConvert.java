package com.techelevator;

import java.io.InputStream;
import java.util.Scanner;

public class TempConvert {

	  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the temperature: "); //prints out a message
		int userInput = input.nextInt(); input.nextLine();//saves what the user types in user input

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit?: ");
		String valueInput = input.nextLine();
		System.out.println(userInput + valueInput + " is " + tempConversion(userInput, valueInput) + (valueInput.startsWith("F") ? "C" : "F"));

	  }

	public static int tempConversion(int userInput, String valueInput) {

		if (valueInput.startsWith("F")) {
			int tempC = (int) ((userInput - 32) / 1.8);
			return tempC;
		} else {
			int tempF = ((int) (userInput * 1.8 + 32));
			return tempF;
		}
	}
}

