package com.design.strategy;

import org.junit.Test;

public class DiscountTest {
    @Test
    public void test(){
        DiscountContext context=new DiscountContext();
        context.setDiscount(new SuperDiscount());
        System.out.println( context.getPay(100));
        context.setDiscount(new VipDiscount());
        System.out.println( context.getPay(100));
        context.setDiscount(new NewDiscount());
        System.out.println( context.getPay(100));
    }
}
