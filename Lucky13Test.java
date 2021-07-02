package com.techelevator;

import org.junit.Test;

public class Lucky13Test {
    @Test
    public void lucky13_ArrayContains1or3_ShouldReturnFalse() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();
        boolean expected = false;

        //Act
        boolean result1 = lucky13.getLucky(new int[] {1, 7, 9});
        boolean result2 = lucky13.getLucky(new int[] {10, 3, 8});

    }
    @Test
    public void lucky13_ArrayContainsNo1or3_ShouldReturnTrue() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();
        boolean expected = true;

        //Act
        boolean result1 = lucky13.getLucky(new int[] {5, 7, 9});
        boolean result2 = lucky13.getLucky(new int[] {10, 12, 8});

    }
    @Test
    public void lucky13_ArrayIsEmpty_ShouldReturnTrue() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();
        boolean expected = true;

        //Act
        boolean result1 = lucky13.getLucky(new int[] {});
        boolean result2 = lucky13.getLucky(new int[] {});

    }
}
