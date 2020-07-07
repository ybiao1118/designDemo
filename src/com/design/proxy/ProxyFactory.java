package com.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
public class ProxyFactory<T>  implements InvocationHandler {
    T obj;
    public ProxyFactory(T obj){
        this.obj=obj;
    }
    public Star getProcxy(){
        return (Star) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
               obj.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" +method.getName() + "方法");
        Object result=method.invoke(obj,args);
        return result;
    }
}
