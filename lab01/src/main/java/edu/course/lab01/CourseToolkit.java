package edu.course.lab01;

import java.util.Arrays;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Возвращает true, если число простое
     */

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i=3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Возвращает true, если палиндром
     */

    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }

        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Возвращает среднее значение масива
     */

    public static double average(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        double sum = Arrays.stream(values).sum();
        double len = Arrays.stream(values).count();
        return sum / len;
    }
}
