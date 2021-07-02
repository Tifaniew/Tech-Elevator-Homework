package com.techelevator;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Destination File: ");
		String pathName = userInput.nextLine();

		File destination = new File(pathName);

		try (PrintWriter writer = new PrintWriter(destination)) {
			for (int i = 1; i < 301; i++) {
				Integer num = Integer.valueOf(i);
				if (i % 3 == 0 && i % 5 == 0) {
					writer.println("FizzBuzz");
				} else if (i % 3 == 0 || num.toString().contains("3")) {
					writer.println("Fizz");
				} else if (i % 5 == 0 || num.toString().contains("5")) {
					writer.println("Buzz");
				} else {
					writer.println(num.toString());
				}

			}

		} catch (FileNotFoundException ex) {
			System.out.println("Can not open file");

		}
	}
}
