package com.design.proxy;

public class JayChou implements Star {
    @Override
    public void sing(String name) {
        System.out.println("周杰伦演唱了"+name);
    }

    @Override
    public void dance(String name) {
        System.out.println("周杰伦跳了"+name);
    }

    @Override
    public void zongyi(String name) {
        System.out.println("周杰伦上了"+name);
    }
}
