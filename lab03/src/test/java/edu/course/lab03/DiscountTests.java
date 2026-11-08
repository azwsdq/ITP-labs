package edu.course.lab03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountTests {
    @Test
    public void NoDiscountTest(){
        DiscountPolicy policy = new NoDiscount();
        double result = policy.apply(50);

        assertEquals(50.0, result);
    }

    @Test
    public void PercentDiscountTest() {
        DiscountPolicy policy = new PercentDiscount(50);
        double result = policy.apply(100);
        assertEquals(50.0, result);
    }

    @Test
    public void PriceCalculator() {
        PriceCalculator noDiscount = new PriceCalculator(new NoDiscount());
        PriceCalculator withDiscount = new PriceCalculator(new PercentDiscount(50));
        assertEquals(100.0, noDiscount.calculate(100));
        assertEquals(50.0, withDiscount.calculate(100));
    }
}
