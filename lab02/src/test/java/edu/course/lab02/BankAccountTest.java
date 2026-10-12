package edu.course.lab02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void returnFalseIfBalanceIsNegative() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new BankAccount(-1));
    }

    @Test
    void constructorAcceptsZeroBalance() {
        BankAccount balance = new BankAccount(0);

        assertEquals(0, balance.getBalance());
    }


}
