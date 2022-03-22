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

    @Mock
    Feline feline;


    @Test
    public void eatMeat() throws Exception {

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> listOfFood = feline.getFood("Хищник");
        assertEquals(listOfFood, List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void eatMeatNegative() throws Exception {

        Mockito.when(feline.getFood("Травоядное")).thenReturn(List.of("Трава", "Различные растения"));
        List<String> listOfFood = feline.getFood("Травоядное");
        assertEquals(listOfFood, List.of("Трава", "Различные растения"));
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