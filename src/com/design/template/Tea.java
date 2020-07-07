package com.design.template;

public class Tea extends Drink {


    @Override
    public void making() {
        System.out.println("制作茶...");
    }

    @Override
    public void add() {
        System.out.println("加柠檬");
    }
}
