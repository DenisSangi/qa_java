package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSoundTest() {


        Cat cat = new Cat(new Feline());
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(actual, expected);
    }

    @Test
    public void getFoodTest() {

        try {
            Cat cat = new Cat(new Feline());
            List<String> actual = cat.getFood();
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}