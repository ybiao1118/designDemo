package com.design.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
    @Test
    public void  test(){
        Person p1=new Person();
        p1.setName("zhangsan");
        p1.setAge(18);
        p1.setSex("man");
        Person p2=new Person();
        p2.setName("lisi");
        p2.setAge(19);
        p2.setSex("man");
        Person p3=new Person();
        p3.setName("xiaohong");
        p3.setAge(20);
        p3.setSex("woman");
        Container container=new MyContainer();
        container.put(p1);
        container.put(p2);
        container.put(p3);
       Iterator iterator=container.iterator();
        System.out.println(iterator.first());
       System.out.println("-----------------");
       while (iterator.hasNext()){
          System.out.println(iterator.next());

       }
        List<String> list=new ArrayList<>();
       list.iterator();
    }
}
