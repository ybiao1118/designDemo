package com.design.proxy;

import org.junit.Test;

public class ProxyTest {
    //静态代理
    @Test
    public  void test(){
        JayChouProxy jayChouProxy=new JayChouProxy(new JayChou());
        jayChouProxy.sing("千里香");
        jayChouProxy.dance("街舞");
        jayChouProxy.zongyi("快乐大本营");
    }
//动态代理
    @Test
    public  void test1(){
      JayChou jayChou=new JayChou();
        ProxyFactory proxyFactory=new ProxyFactory<Star>(jayChou);
        Star skill= proxyFactory.getProcxy();
        skill.sing("千里香");
        skill.dance("街舞");
        skill.zongyi("快乐大本营");
        System.out.println("--------------------------");
        JjLin jjLin=new JjLin();
        ProxyFactory factory=new ProxyFactory<Star>(jjLin);
        Star star= factory.getProcxy();
        star.sing("曹操");
        star.dance("肚皮舞");
        star.zongyi("天天向上");
    }

}
