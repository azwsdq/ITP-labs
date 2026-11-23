package edu.course.lab04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.HashMap;


public class BookTest {
    @Test
    void findsValueByBookWithSameIsbn() {
        Book fBook = new Book("1234567", "asd");
        Book sBook = new Book("1234567","dsa");
        HashMap<Book, String> books = new HashMap<>();
        books.put(fBook, "На полке");

        assertEquals("На полке", books.get(sBook));
    }

    @Test
    void falseIfDontSameIsbn() {
        Book fBook = new Book("1234567", "asd");
        Book sBook = new Book("123457","dsa");
        boolean result = fBook.equals(sBook);

        assertFalse(result);

    }
}
