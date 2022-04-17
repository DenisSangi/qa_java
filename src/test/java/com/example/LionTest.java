package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

public class LionTest {

    @Test
    public void lionGetKittensTest() throws Exception {
        //Arrange
        Lion lion = spy(new Lion( "Самка"));
        int expectedKittenNumber = 1;

        //Act
        int actualKittenNumber = lion.getKittens();

        //Assert
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",expectedKittenNumber, actualKittenNumber);
    }

    @Test
    public void lionGetFoodTest() throws Exception {

        Lion lion = spy(new Lion("Самец"));
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualListOfFood = lion.getFood("Хищник");

        assertEquals(expectedListOfFood, actualListOfFood);
    }

}
