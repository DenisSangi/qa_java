package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionGetKittensTest() throws Exception {
        //Arrange
        Lion lion = new Lion( feline,"Самка");
        int expectedKittenNumber = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);

        //Act
        int actualKittenNumber = lion.getKittens();

        //Assert
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",expectedKittenNumber, actualKittenNumber);
    }

    @Test
    public void lionGetFoodTest() throws Exception {

        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualListOfFood = lion.getFood();

        assertEquals(expectedListOfFood, actualListOfFood);
    }

}
