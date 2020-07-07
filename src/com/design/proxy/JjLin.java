package com.design.proxy;

public class JjLin implements Star {
    @Override
    public void sing(String name) {
        System.out.println("林俊杰演唱了"+name);
    }

    @Override
    public void dance(String name) {
        System.out.println("林俊杰跳了"+name);
    }

    @Override
    public void zongyi(String name) {
        System.out.println("林俊杰上了"+name);
    }
}
