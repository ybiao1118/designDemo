package com.design.singleton;

import org.junit.Test;

public class AnimalTest {
    @Test
    public  void test(){
        Animal animal=Animal.getInstance();
        Animal animal1=Animal.getInstance();
        System.out.println(animal);
        System.out.println(animal1);
    }
}
