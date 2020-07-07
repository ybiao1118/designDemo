package com.design.strategy;

public class SuperDiscount implements Discount {
    @Override
    public double getDiscount(double old) {
        System.out.println("超级vip打7折");
        return old*0.7;
    }
}
