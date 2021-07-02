package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    @Test
    public void wordCount_ArrayOfStrings_ShouldReturnKeyAndCountForEachString() {
        //Arrange
        WordCount wordCount = new WordCount();
        String[] data = new String[]{"a", "b", "c", "b", "a"};

        //Act
        Map<String, Integer> result = wordCount.getCount(data);

        //Assert
        Assert.assertEquals(result.get("a"), Integer.valueOf(2));
        Assert.assertEquals(result.get("b"), Integer.valueOf(2));
        Assert.assertEquals(result.get("c"), Integer.valueOf(1));
    }
    @Test
    public void wordCount_ArrayIsEmpty_ShouldReturnCurlyNull() {
        //Arrange
        WordCount wordCount = new WordCount();
        String[] data = new String[]{null};

        //Act
        Map<String, Integer> result = wordCount.getCount(data);

        //Assert
        Assert.assertEquals(result.get(null), Integer.valueOf(1));
        Assert.assertEquals(result.get(null), Integer.valueOf(1));
        Assert.assertEquals(result.get(null), Integer.valueOf(1));
    }
}
