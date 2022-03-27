package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class CatTest {

    @Mock
    Feline feline;

    @Before
    public void before() {
        feline = mock(Feline.class);
    }

    @Test
    public void getSoundTest() {


        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(actual, expected);
    }

    @Test
    public void getFoodTest() throws Exception{

            Cat cat = new Cat(feline);
            cat.getFood();
            Mockito.verify(cat.predator).eatMeat();
    }
}