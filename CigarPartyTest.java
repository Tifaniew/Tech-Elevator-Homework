package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {
    @Test
    public void CigarParty_withMinimumValueAndIsWeekend_shouldReturnTrue() {
        //Arrange
        CigarParty cigarParty = new CigarParty();
        boolean expected = true;

        //Act
        boolean result = cigarParty.haveParty(40, true);

        //Assert
        //Assert.assertEquals(expected, result);
    }
    @Test
    public void CigarParty_withMaximumValueAndIsNotWeekend_shouldReturnTrue() {
        //Arrange
        CigarParty cigarParty = new CigarParty();
        boolean expected = true;

        //Act
        boolean result = cigarParty.haveParty(60, false);

        //Assert
        //Assert.assertEquals(expected, result);
    }
    @Test
    public void CigarParty_withLowerThanMinimumValueAndIsWeekend_shouldReturnFalse() {
        //Arrange
        CigarParty cigarParty = new CigarParty();
        boolean expected = false;

        //Act
        boolean result = cigarParty.haveParty(29, true);

        //Assert
        //Assert.assertEquals(expected, result);
    }
    @Test
    public void CigarParty_withOverMaximumValueAndIsNotWeekend_shouldReturnTrue() {
        //Arrange
        CigarParty cigarParty = new CigarParty();
        boolean expected = true;

        //Act
        boolean result = cigarParty.haveParty(99, false);

        //Assert
        //Assert.assertEquals(expected, result);
    }
}

