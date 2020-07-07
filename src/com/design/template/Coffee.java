package com.design.template;

public class Coffee extends Drink {
    @Override
    public void making() {
        System.out.println("制作咖啡...");
    }

    @Override
    public void add() {
        System.out.println("加牛奶和糖");
    }
}
