package com.design.iterator;

public interface Container<T> {
    public abstract  Iterator iterator();
    public  abstract void put(T t);
}
