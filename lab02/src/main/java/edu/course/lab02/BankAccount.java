package edu.course.lab02;

public class BankAccount {
    private int balance;
    public BankAccount(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс меньше 0");
        }
        this.balance = balance;
    }

    public int deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("вы не можете пополнить на отрицательную сумму");
        }
        return balance += amount;
    }

    public int withdraw(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Нельзя отнять отрицательную сумму");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Нельзя снять больше чем есть на балансе");
        }
        return balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

}
