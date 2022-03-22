
package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionHasManeTest {

    private String sex;
    private boolean expected;

    public LionHasManeTest(String sex, boolean expected) {
        this.expected = expected;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[] getLionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Лев", false},
        };
    }

    @Test
    public void doesHaveMane() {

        try {
            Lion lion = new Lion(sex);
            boolean actual = lion.doesHaveMane(sex, expected);
            assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самей или самка");
        }
    }
}