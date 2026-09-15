package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        assertFalse(result);
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

    /**
     * isPalindrome
     */

    @Test
    void returnTrueIfPalindrome() {
        boolean result = CourseToolkit.isPalindrome("abccba");

        assertTrue(result);
    }

    @Test
    void returnFalseIfNotPalindrome() {
        boolean result = CourseToolkit.isPalindrome("abcds");

        assertFalse(result);
    }

    /**
     * Ошибочные сообщения
     */
    @Test
    void returnErrMsgIfNull() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(null));
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.min(null));
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.max(null));
    }

    /**
     * average
     */

    @Test
    void defaultScene() {
        double result = CourseToolkit.average(new int[] {1, 2, 3, 4, 5});

        assertEquals(3, result);
    }

    @Test
    void NegativeScene() {
        double result = CourseToolkit.average(new int[] {1, -2, 3, -4, -5});

        assertEquals(-1.4, result);
    }

    /**
     * Min and Max
     */

    @Test
    void returnMinOfArray() {
        int result = CourseToolkit.min(new int[] {1, 2, -3, 4, 5});

        assertEquals(-3, result);
    }

    @Test
    void returnMaxOfArray() {
        int result = CourseToolkit.max(new int[] {-1, -3, -9, -2, -5});

        assertEquals(-1, result);
    }
}
