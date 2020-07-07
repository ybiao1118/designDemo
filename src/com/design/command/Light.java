package com.design.command;
//命令接受者(电灯)
public class Light extends Appliances {
    public  Light(){
        desc="电灯";
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
