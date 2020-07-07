package com.design.decorator;

public class AddIce extends Ingredients {
    public Drink drink;
    public  AddIce(Drink drink){
        this.drink=drink;
    }

    @Override
    public double price() {
        return drink.price()+5;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+"+冰";
    }
}
