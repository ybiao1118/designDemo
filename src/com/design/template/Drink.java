package com.design.template;

public abstract class Drink {
    public boolean flag;
    //模板方法，算法的执行步骤
    public void makeDrink(boolean flag){
        this.flag=flag;
        boilWater();
        making();
        pour();
        if(isAdd()){
            add();
        }
    }
    //共性算法在抽象类中实现
    public  void  boilWater(){
        System.out.println("烧开水");
    }
    //抽象算法在子类中实现
    public abstract void making();
    //共性算法在抽象类中实现
    public   void pour(){
        System.out.println("倒入杯中");
    }
    //抽象算法在子类中实现
    public abstract  void  add();
    //钩子算法
    public boolean isAdd(){
        return flag;
    }
}
