package com.design.decorator;

public class Juice extends Drink {

    public Juice(){
        description="果汁";
    }
    @Override
    public double price() {
        return 5;
    }
}
