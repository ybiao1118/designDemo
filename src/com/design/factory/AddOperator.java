package com.design.factory;

public class AddOperator extends  Operator {
    @Override
    protected double getResult() throws Exception {
        return getNumberA()+getNumberB();
    }
}
