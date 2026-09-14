package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    /**
     * isEven
     */

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnTrueForZero() {
        boolean result = CourseToolkit.isEven(0);

        assertTrue(result);
    }

    /**
     * isPrime
     */

    @Test
    void returnTrueForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(13);

        assertTrue(result);
    }

    @Test
    void returnFalseForNegativeNumber() {
        boolean result = CourseToolkit.isPrime(-13);

        assertTrue(result);
    }

    @Test
    void returnTrueForTwo() {
        boolean result = CourseToolkit.isPrime(2);

        assertTrue(result);
    }

    @Test
    void returnFalseForNonPrime() {
        boolean result = CourseToolkit.isPrime(4);

        assertTrue(result);
    }
}
