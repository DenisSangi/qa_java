package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeat() throws Exception {

        Feline feline = new Feline();
        assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void eatMeatNegative() throws Exception {

        Feline feline = new Feline();
        assertNotEquals(feline.eatMeat(), List.of("Трава", "Различные растения"));
    }


    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(actual, expected);
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expected = 2;
        int actual = feline.getKittens(2);
        assertEquals(actual, expected);
    }

    @Test
    public void getKittensSecond() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(actual, expected);
    }
}