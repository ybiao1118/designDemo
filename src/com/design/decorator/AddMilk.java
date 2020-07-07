package com.design.decorator;

public class AddMilk extends Ingredients{
    public Drink drink;
    public  AddMilk(Drink drink){
        this.drink=drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription()+"+牛奶";
    }

    @Override
    public double price() {
        return drink.price()+5;
    }
}
