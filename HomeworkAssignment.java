package com.techelevator;

public class HomeworkAssignment {
    //Instance Variables
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
//Consructor
    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }
    //Getters
    public int getEarnedMarks() {
        return earnedMarks;
    }
    //Setter
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
    //Getter
    public int getPossibleMarks() {
        return possibleMarks;
    }
    public String getSubmitterName() {
        return submitterName;
    }

    //Derived Property
    public String getLetterGrade() {
        double totalGrade = (double)earnedMarks / possibleMarks * 100.0;
        if (totalGrade >= 90)  {
            return "A";
        } else if (totalGrade >= 80) {
            return "B";
        } else if (totalGrade >= 70)  {
            return "C";
        } else if (totalGrade >= 60) {
            return "D";
        }
            return "F";
        }
    }

