package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the length: "); //prints out a message
		int userLength = input.nextInt(); input.nextLine();//saves what the user types in user input

		System.out.print("Is the measurement in (m)eter, or (f)eet?: ");
		String measurement = input.nextLine();
		System.out.println(userLength + measurement + " is " + lengthConversion(userLength, measurement) + (measurement.startsWith("m") ? "f" : "m"));
	}
	public static int lengthConversion(int userLength, String measurement) {

		if (measurement.startsWith("m")) {
			int feet = (int) ((userLength * 0.3048));
			return feet;
		} else {
			int meters = ((int) (userLength * 3.2808399));
			return meters;
		}
	}
}


