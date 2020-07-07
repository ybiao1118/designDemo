package com.design.factory;


import org.junit.Test;

public class FactoryTest {
    @Test
    public void test(){
        OperatorFactory factory=new AddOperatorFactory();
        Operator operator=factory.createOperator();
        operator.setNumberA(15);
        operator.setNumberB(10);
        try {
            System.out.println(operator.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
