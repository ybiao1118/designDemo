package com.design.observer;

public class ReceiveMessage implements Observer {
    public String name;
    public  ReceiveMessage(String name){
        this.name=name;
    }
    @Override
    public void update(String message) {
        System.out.println(name+"接受到消息:"+message);
    }
}
