package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupTest {
    @Test
    public void animalGroup_withValidAnimalNameCorrectCase_shouldReturnCorrectValue() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String expected = "Pride";

        //Act
        String result = animalGroupName.getHerd("Lion");

        //Assert
        Assert.assertEquals(expected, result);
    }
    //animalName is all caps
    //animalName is all lower
    //animalName is mixed case

    @Test
    public void AnimalGroup_withValidAnimalNameAllCaps_shouldReturnCorrectValue() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String expected = "Pride";

        String result = animalGroupName.getHerd("Lion");
        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void AnimalGroup_withValidAnimalNameAllLowerCase_shouldReturnCorrectValue() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String expected = "Pride";

        String result = animalGroupName.getHerd("lion");
        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void AnimalGroup_withValidAnimalNameMixedCase_shouldReturnCorrectValue() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String expected = "Pride";

        String result = animalGroupName.getHerd("LIoN");
        //Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void animalGroupName_withNullAnimalName_shouldReturnUnknown() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String expected = "unknown";

        //Act
        String result = animalGroupName.getHerd(null);

        //Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void animalGroupName_withNullAnimalNameNotFound_shouldReturnUnknown() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String expected = "unknown";

        //Act
        String result = animalGroupName.getHerd("Tiffany");

        //Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void animalGroupName_withEmptyAnimalName_shouldReturnUnknown() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String expected = "unknown";

        //Act
        String result = animalGroupName.getHerd("");

        //Assert
        Assert.assertEquals(expected, result);
    }
}
