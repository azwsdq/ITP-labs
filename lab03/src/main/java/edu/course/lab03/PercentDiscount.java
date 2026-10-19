package edu.course.lab03;

public class PercentDiscount implements DiscountPolicy {
    private int percent;
    public PercentDiscount(int percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("The percentage cant be less than 0, or greater than 100");
        }
        this.percent = percent/100;
    }

    @Override
    public double apply(double price) {
        return price * (1 - percent / 100.0);
    }
}
