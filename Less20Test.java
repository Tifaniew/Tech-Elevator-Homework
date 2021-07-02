package com.techelevator;

import org.junit.Test;

public class Less20Test {
    @Test
    public void less20_NumberIs1or2LessThan20_ShouldReturnTrue() {
        //Arrange
        Less20 less20 = new Less20();
        boolean expected = true;

        //Act
        boolean result1 = less20.isLessThanMultipleOf20(19);
        boolean result2 = less20.isLessThanMultipleOf20(18);

    }
    @Test
    public void less20_NumberIsAMultipleOf20_ShouldReturnFalse() {
        //Arrange
        Less20 less20 = new Less20();
        boolean expected = false;

        //Act
        boolean result = less20.isLessThanMultipleOf20(60);

    }

}
