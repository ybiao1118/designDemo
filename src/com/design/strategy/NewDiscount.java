package com.design.strategy;

public class NewDiscount implements Discount {
    @Override
    public double getDiscount(double old) {
        System.out.println("新用户不打折");
        return old;
    }
}
