package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats = 0;
    private int totalCoachSeats;
    private int bookedCoachSeats = 0;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public int getAvailableFirstClassSeats() {

        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;

    }

    public String getPlaneNumber() {

        return planeNumber;
    }

    public int getTotalFirstClassSeats() {

        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {

        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {

        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass == true) {
            if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            } else {
                return false;
            }

        } else {
            if (forFirstClass == false) {
                if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
                    bookedCoachSeats += totalNumberOfSeats;
                    return true;
                } else {

                }
            }
        }
        return false;
    }
}


