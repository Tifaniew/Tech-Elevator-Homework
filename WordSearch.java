package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter a file path: ");
		String path = userInput.nextLine();

		System.out.print("Enter word to search for: ");
		String searchFor = userInput.nextLine();

		System.out.print("Should the search be case sensitive (Y/N)? ");
		String caseSensitiveSearch = userInput.nextLine();

		if(path != null && searchFor != null) {
			File inputFile = new File(path);
			try (Scanner input = new Scanner(inputFile)) {
				int lineCounter = 1;
				while(input.hasNextLine()) {
					String line = input.nextLine();
					if(caseSensitiveSearch.equals("Y")) {
						if(line.contains(searchFor)) {
							System.out.println(String.format("%d) %s", lineCounter, line));
						}
						} else {
							if(line.toLowerCase().contains(searchFor.toLowerCase())) {
								System.out.println(String.format("%d) %s", lineCounter, line));
							}
						}
						lineCounter++;
					}
			} catch(FileNotFoundException ex) {
				System.out.print("Could not open file path: " + path + " Error: " + ex.getMessage());
			}
		}
	}
}
