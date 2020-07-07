package com.design.strategy;

public class DiscountContext {
    private  Discount discount;
//    public DiscountContext(Discount discount){
//        this.discount=discount;
//    }
    public double getPay(double money){
       return discount.getDiscount(money);
    }
    public void setDiscount(Discount discount){
        this.discount=discount;
    }
    public Discount getDiscount(){
        return discount;
    }
}
