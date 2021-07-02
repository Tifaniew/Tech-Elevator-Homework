package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {
    @Test
    public void frontTimes_StringIsEmpty_ShouldReturnEmptyString() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        String expected = "";

        //Act
        String result = frontTimes.generateString("", 4);

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void frontTimes_StringIsLessThan2_ShouldReturnStringWithCharactersRepeating() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        String expected = "gogogo";

        //Act
        String result = frontTimes.generateString("go", 3);

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void frontTimes_StringIsAtLeast3orHigher_ShouldReturnStringFirst3CharactersRepeating() {
        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        String expected = "googoo";

        //Act
        String result = frontTimes.generateString("good", 2);

        //Assert
        Assert.assertEquals(expected, result);
    }
}
