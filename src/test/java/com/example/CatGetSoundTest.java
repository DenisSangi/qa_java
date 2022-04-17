package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class CatTest {

    //@Spy
    //Feline feline;

    @Mock

    Feline feline;

    @Test
    public void testGetSound() {
        //AAA

        //Arrange
        Cat cat = new Cat(feline);
        String expected = "Мяу";

        //Act
        String actual = cat.getSound();

        //Assert
        assertEquals(expected, actual);

    }
}