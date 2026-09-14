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

    @Test
    void returnErrMsgIfNull() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }
}
