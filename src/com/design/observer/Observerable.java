package com.design.observer;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 */
public interface Observerable {
    //添加观察者
    public void addObserve(Observer observer);
    //删除观察者
    public void deleteObserver(Observer observer);
    //通知观察者修改信息
    public void notifyObserve(String msg);
}
