package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
  @Test
    public void dateFashion_YouAndDate8orHigher_shouldReturnYes() {
      //Arrange
      DateFashion dateFashion = new DateFashion();
      int expected = 2;

      //Act
      int result = dateFashion.getATable(9,12);

      //Assert
      Assert.assertEquals(expected, result);
  }
    @Test
    public void dateFashion_YouAndDate2orLower_shouldReturnNo() {
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int expected = 0;

        //Act
        int result = dateFashion.getATable(2,1);

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void dateFashion_YouAre8orHigher_DateIs2orLower_shouldReturnNo() {
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int expected = 0;

        //Act
        int result = dateFashion.getATable(9,2);

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void dateFashion_YouAndDateAreBothMidRange_shouldReturnMaybe() {
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int expected = 1;

        //Act
        int result = dateFashion.getATable(5,5);

        //Assert
        Assert.assertEquals(expected, result);
    }
}
