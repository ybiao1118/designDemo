package com.design.command;

public class TV extends Appliances {
    public  TV(){
        desc="电视";
    }
    @Override
    void on() {
        System.out.println(desc+"已经打开了");
    }

    @Override
    void off() {
        System.out.println(desc+"电视已经关闭了");
    }
}
