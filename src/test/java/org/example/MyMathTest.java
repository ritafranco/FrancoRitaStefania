package org.example;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MyMathTest {

    public static MyMath math;

    @BeforeClass
    public static void prepare(){
        System.out.println("Before");
        math = new MyMath();
    }

    @Test
    public void primeNumbersGenerator(){
        assertEquals(new LinkedList<Integer>(), math.generatoreNumeriPrimi(1));
        assertEquals(Arrays.asList(2,3,5,9,11,13,17,19), math.generatoreNumeriPrimi(20));
    }

    @Test
    public void isPrimeWorks(){
        assertFalse(math.isPrime(9));
        assertFalse(math.isPrime(1));
        assertTrue(math.isPrime(2));

        List<Integer> primi = Arrays.asList(11, 13, 17, 22, 45, 55);
        for (int primo : primi)
        {
            assertTrue(math.isPrime(primo));
        }
    }
}