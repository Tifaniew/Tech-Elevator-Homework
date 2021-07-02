package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {
    @Test
    public void stringBits_IfStringIsEmpty_ShouldReturnEmptyString() {
        //Arrange
        StringBits stringBits = new StringBits();
        String result = "";

        //Act
        String expected = stringBits.getBits("");

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void stringBits_IfStringIsNull_ShouldReturnEmptyString() {
        //Arrange
        StringBits stringBits = new StringBits();
        String result = "";

        //Act
        String expected = stringBits.getBits(null);

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void stringBits_IfString_ShouldReturnNewStringWithEveryOtherCharacterStartingWIthTheFirst() {
        //Arrange
        StringBits stringBits = new StringBits();
        String result = "Tfay";

        //Act
        String expected = stringBits.getBits("Tiffany");

        //Assert
        Assert.assertEquals(expected, result);
    }
}
