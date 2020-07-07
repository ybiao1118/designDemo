package com.design.strategy;

public class VipDiscount implements Discount {
    @Override
    public double getDiscount(double old) {
        System.out.println("vip打八折");
        return old*0.8;
    }
}
