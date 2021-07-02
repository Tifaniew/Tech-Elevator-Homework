package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput= new Scanner(System.in);

        System.out.println("What is the search term?: ");
        String searchTerm = userInput.nextLine();

        System.out.println("What is the replacement term?: ");
        String replacementTerm = userInput.nextLine();

        System.out.println("What is the source file?: ");
        String path = userInput.nextLine();

        System.out.println("What is the destination file?: ");
        String destinationPath = userInput.nextLine();

        File inputFile = new File(path);
        File destination = new File(destinationPath);

        try (Scanner inFile = new Scanner(inputFile)) {
            try (PrintWriter writer = new PrintWriter(destination)) {
                while(inFile.hasNextLine()) {
                    String line = inFile.nextLine();
                    System.out.println(line);
                    writer.println(line.replaceAll(searchTerm, replacementTerm));

                }

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}





