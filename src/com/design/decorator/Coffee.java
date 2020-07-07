package com.design.decorator;

public class Coffee extends Drink {

    public  Coffee(){
        description="咖啡";
    }
    @Override
    public double price() {
        return 10;
    }

}
