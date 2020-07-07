package com.design.iterator;

import java.util.List;

public class MyIterator<T> implements  Iterator {
    private List<T> list;
    private  int index = 0;
    public MyIterator(List<T> list) {
        this.list = list;
    }
    @Override
    public T first() {
        if(this.list.size() <= 0){
            return null;
        }else{
            return this.list.get(0);
        }
    }
    @Override
    public T previous() {
        if((this.index ) < 0){
            return null;
        }else{
            T t=this.list.get(index);
            index-=1;
            return t;
        }
    }

    @Override
    public T next() {
        if((this.index ) >= this.list.size()){
            return null;
        }else{
            T t=this.list.get(index);
            index+=1;
            return t;
        }
    }

    @Override
    public boolean hasNext() {
        if(this.index <=(this.list.size() - 1)){
            return true;
        }
        return false;
    }
}
