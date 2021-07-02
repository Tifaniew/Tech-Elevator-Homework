package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
    @Test
    public void maxEnd3_1stElementIsLarger_ShouldReturnChangedArrayWithTheFirstElement() {
        //Arrange
        MaxEnd3 maxEnd = new MaxEnd3();
        int[] expected = (new int[] {5, 5, 5});

        //Act
        int[] result = maxEnd.makeArray(new int[] {5, 1, 3});

        //Assert
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    public void maxEnd3_3rdElementIsLarger_ShouldReturnChangedArrayWithThe3rdElement() {
        //Arrange
        MaxEnd3 maxEnd = new MaxEnd3();
        int[] expected = (new int[] {7, 7, 7});

        //Act
        int[] result = maxEnd.makeArray(new int[] {2, 4, 7});

        //Assert
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    public void maxEnd3_MiddleElementIsLarger_ShouldReturnArrayWithTheLargestBetween1stand3rd() {
        //Arrange
        MaxEnd3 maxEnd = new MaxEnd3();
        int[] expected = (new int[] {5, 5, 5});

        //Act
        int[] result = maxEnd.makeArray(new int[] {5, 12, 3});

        //Assert
        Assert.assertArrayEquals(expected, result);
    }
}
