package com.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyContainer<T> implements Container {
    List<T> list;
    public MyContainer(){
        this.list=new ArrayList<T>();
    }
    @Override
    public Iterator iterator() {
        return new MyIterator(list);
    }

    @Override
    public void put(Object o) {
        list.add((T)o);
    }


}
