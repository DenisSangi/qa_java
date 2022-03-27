package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class LionTest {

    @Mock
    Feline feline;

    @Before
    public void before() {
        feline = mock(Feline.class);
    }

    @Test
    public void lionGetKittensPositive() {

        Lion lion = new Lion(feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionGetKittensNegative() {

        Lion lion = new Lion(feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertNotEquals(8, lion.getKittens());
    }

    @Test
    public void lionGetFood() throws Exception{


            Lion lion = new Lion(feline);
            lion.getFood();
            Mockito.verify(feline).getFood( "Хищник");
    }
}