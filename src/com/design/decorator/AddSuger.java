package com.design.decorator;

public class AddSuger extends Ingredients {
    public Drink drink;
    public  AddSuger(Drink drink){
        this.drink=drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription()+"+糖";
    }

    @Override
    public double price() {
        return drink.price()+5;
    }
}
