package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;


public class CatGetFoodTest {

    Feline feline = spy(new Feline());

    @Test
    public void testCatGetFood() throws Exception {

        //Arrange
        Cat cat = new Cat(feline);

        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        //Act
        List<String> actual = cat.getFood();

        //Assert
        assertEquals(expected, actual);
    }
}


