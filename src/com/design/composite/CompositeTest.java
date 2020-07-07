package com.design.composite;

import org.junit.Test;

public class CompositeTest {
    @Test
    public  void test(){
        Company alibaba=new ConcreteCompany("阿里巴巴");
        Company taobao=new ConcreteCompany("淘宝");
        Company pay=new ConcreteCompany("支付宝");

        Company alibabaHR=new Department("阿里巴巴人力资源部");
        Company alibabaCW=new Department("阿里巴巴财务部");
        Company taobaoHR=new Department("淘宝人力资源部");
        Company taobaoCW=new Department("淘宝财务部");
        Company payHR=new Department("支付宝人力资源部");
        Company payCW=new Department("支付宝财务部");

        taobao.add(taobaoHR);
        taobao.add(taobaoCW);
        pay.add(payCW);
        pay.add(payHR);

        alibaba.add(alibabaHR);
        alibaba.add(alibabaCW);
        alibaba.add(taobao);
        alibaba.add(pay);

        alibaba.display(0);

    }
}
