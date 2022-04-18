package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class FelineTest {

    @Test
    public void felineEatMeatTestPositive() throws Exception {

        Feline feline = spy(new Feline());

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
        verify(feline).getFood("Хищник");
    }

    @Test
    public void felineEatMeatTestNegative() throws Exception {
        Feline feline = spy(new Feline());

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Трава", "Различные растения"));
        List<String> expected = List.of("еда", "вода");
        List<String> actual = feline.eatMeat();
        assertNotEquals(expected, actual);
        verify(feline).getFood("Хищник");
    }

    @Test
    public void getKittensFirst() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(actual, expected);
    }

    @Test
    public void getKittensSecond() {
        Feline feline = new Feline();
        int expected = 2;
        int actual = feline.getKittens(2);
        assertEquals(actual, expected);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

}
