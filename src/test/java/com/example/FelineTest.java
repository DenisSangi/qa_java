package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class FelineEatMeetTest {

    @Test
    public void felineEatMeatTestPositive() throws Exception {
        Feline feline = spy(new Feline());
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
        verify(feline).getFood("Хищник");
        System.out.println(feline.eatMeat());
    }

    @Test
    public void felineEatMeatTestNegative() throws Exception {
        Feline feline = spy(new Feline());
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Трава", "Различные растения"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertNotEquals(expected, actual);
        verify(feline).getFood("Хищник");
        System.out.println(feline.eatMeat());
    }

    @Test
    public void getKittensFirst() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        System.out.println(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void getKittensSecond() {
        Feline feline = new Feline();
        int expected = 2;
        int actual = feline.getKittens(2);
        assertEquals(actual, expected);
    }

}
