package edu.course.lab03;

public class NoDiscount implements DiscountPolicy {
    public double apply(double price) {
        return price;
    }
}
