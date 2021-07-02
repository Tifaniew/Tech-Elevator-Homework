package com.techelevator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: "); //prints out a message
		int userInput = input.nextInt(); input.nextLine();//saves what the user types in user input

		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		//System.out.println("0 1");

		while(firstNum + secondNum <= userInput) {
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);

		}
	}

}
