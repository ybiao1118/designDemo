package com.design.proxy;
//静态代理
public class JayChouProxy implements Star {
    public  JayChou jayChou;
    public  JayChouProxy(JayChou jayChou){
        this.jayChou=jayChou;
    }
    @Override
    public void sing(String name) {
        jayChou.sing(name);
    }

    @Override
    public void dance(String name) {
        jayChou.dance(name);
    }

    @Override
    public void zongyi(String name) {
        jayChou.zongyi(name);
    }
}
