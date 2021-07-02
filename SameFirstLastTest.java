package com.techelevator;

import org.junit.Test;

public class SameFirstLastTest {
    @Test
    public void sameFirstLast_IfArrayLengthIs1orMore_1standLastElementAreEqual_ShouldReturnTrue() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        boolean expected = true;

        //Act
        boolean result = sameFirstLast.isItTheSame(new int[] {4, 6, 9, 4});

        //Assert

    }
    @Test
    public void sameFirstLast_IfArrayLengthIs1orMore_1standLastElementAreNotEqual_ShouldReturnFalse() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        boolean expected = false;

        //Act
        boolean result = sameFirstLast.isItTheSame(new int[] {2, 6, 9,});

        //Assert

    }
    @Test
    public void sameFirstLast_IfArrayLengthIs1_ShouldReturnFalse() {
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        boolean expected = false;

        //Act
        boolean result = sameFirstLast.isItTheSame(new int[] {2});

        //Assert

    }
}
