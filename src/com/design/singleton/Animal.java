package com.design.singleton;

public class Animal {
    private  Animal(){ }
    //双锁模式，保证线程安全,懒汉式
//    private  static  Animal animal=null;
//    public  static Animal getInstance(){
//        if(animal==null){
//            synchronized(Animal.class){
//                if(animal==null){
//                    animal=new Animal();
//                }
//            }
//
//        }
//        return  animal;
//    }

    //饿汉式，浪费资源，加载类就实例化了
//    private  static  Animal animal=new Animal();
//    public  static  Animal getInstance(){
//        return animal;
//    }
    //类部类创建,线程安全,懒汉式与饿汉式结合，推荐
    private static class  AnimalHolder{
        private static Animal instance=new Animal();
    }
    public  static Animal getInstance(){
        return AnimalHolder.instance;
    }
}
