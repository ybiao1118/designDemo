package com.design.iterator;

public interface Iterator<T> {
    public T first();

    public T previous();

    public T next();

    public boolean hasNext();
}
