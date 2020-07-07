package com.design.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public  void test(){
        Drink coffee=new Coffee();
        coffee=new AddMilk(coffee);
        coffee=new AddIce(coffee);
        coffee=new AddSuger(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.price());
        Drink juice=new Juice();
        juice=new AddMilk(juice);
        juice=new AddIce(juice);
        juice=new AddSuger(juice);
        System.out.println(juice.getDescription());

       // System.out.println(juice.price());
    }
}
