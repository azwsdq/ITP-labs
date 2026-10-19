package edu.course.lab02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void returnExceptionIfBalanceIsNegative() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new BankAccount(-1));
    }

    @Test
    void constructorAcceptsZeroBalance() {
        BankAccount balance = new BankAccount(0);

        assertEquals(0, balance.getBalance());
    }

    @Test
    void addDeposit50() {
        BankAccount balance = new BankAccount(0);
        balance.deposit(50);

        assertEquals(50, balance.getBalance());
    }

    @Test
    void depositRejectsNonPositiveAmount() {
        BankAccount balance = new BankAccount(100);
        assertThrows(
                IllegalArgumentException.class,
                () -> balance.deposit(-1));
    }

    @Test
    void withdrawReducesBalance() {
        BankAccount balance = new BankAccount(100);
        balance.withdraw(20);

        assertEquals(80, balance.getBalance());
    }

    @Test
    void withdrawRejectsNonPositiveAmount() {
        BankAccount balance = new BankAccount(100);
        assertThrows(IllegalArgumentException.class,
                () -> balance.withdraw(-20));
    }

    @Test
    void withdrawRejectsAmountGreaterThanBalance() {
        BankAccount balance = new BankAccount(100);
        assertThrows(IllegalArgumentException.class,
                () -> balance.withdraw(120));
    }


}
