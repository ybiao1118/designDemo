package com.design.builder;

import org.junit.Test;

public class BuilderTest {
    @Test
    public  void  test(){

        ComputerDirector director=new ComputerDirector();
        Builder builder=new DellComputerBuilder();
        Computer computer=director.construct(builder);
        System.out.println(computer.toString());
        builder=new ASUSComputerBuilder();
        computer=director.construct(builder);
        System.out.println(computer.toString());
    }
}
