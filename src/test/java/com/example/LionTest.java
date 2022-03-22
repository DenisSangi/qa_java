package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    @Test
    public void lionGetKittensPositive() {

        Lion lion = new Lion(new Feline());
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void lionGetKittensNegative() {

        Lion lion = new Lion(new Feline());
        int expected = 8;
        int actual = lion.getKittens();
        assertNotEquals(expected, actual);
    }

    @Test
    public void lionGetFood() {

        try {
            Lion lion = new Lion(new Feline());
            List<String> actual = lion.getFood();
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}