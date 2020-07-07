package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePushed implements Observerable {
    List<Observer> list;
    public  MessagePushed(){
        this.list=new ArrayList<Observer>();
    }
    @Override
    public void addObserve(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserve(String msg) {
        for(Observer o:list){
            o.update(msg);
        }
    }

    public  void sendMsg(String msg){
        System.out.println("推送消息:"+msg);
        notifyObserve(msg);
    }
}
