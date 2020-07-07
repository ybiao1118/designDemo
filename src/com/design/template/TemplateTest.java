package com.design.template;

import org.junit.Test;

public class TemplateTest {
    @Test
    public void test(){
        System.out.println("----------------");
        Coffee coffee=new Coffee();
        coffee.makeDrink(true);
        System.out.println("----------------");
        Tea tea=new Tea();
        tea.makeDrink(false);
    }
}
