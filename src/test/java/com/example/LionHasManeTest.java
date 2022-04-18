package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionHasManeTest {

    private String sex;
    private boolean expected;
    static Feline feline;

    public LionHasManeTest(Feline feline, String sex, boolean expected) {
        this.expected = expected;
        this.sex = sex;
        this.feline = feline;
    }

    @Parameterized.Parameters
    public static Object[] getLionData() {
        return new Object[][]{
                {feline,"Самец", true},
                {feline, "Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {

        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
