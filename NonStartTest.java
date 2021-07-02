package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {
    @Test
    public void nonStart_AStringIsEmpty_ShouldReturnBSubstringMinusFirstCharacter() {
        //Arrange
        NonStart nonStart = new NonStart();
        String expected = "ello";

        //Act
        String result = nonStart.getPartialString("", "hello");

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void nonStart_BStringIsEmpty_ShouldReturnASubstringMinusFirstCharacter() {
        //Arrange
        NonStart nonStart = new NonStart();
        String expected = "rice";

        //Act
        String result = nonStart.getPartialString("price", "");

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void nonStart_AStringAndBString_ShouldReturnCombinedStringMinusFirstCharacter() {
        //Arrange
        NonStart nonStart = new NonStart();
        String expected = "ightrice";

        //Act
        String result = nonStart.getPartialString("right", "price");

        //Assert
        Assert.assertEquals(expected, result);
    }
}
