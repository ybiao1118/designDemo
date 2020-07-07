package com.design.factory;

public class MulOperator extends Operator {
    @Override
    protected double getResult() throws Exception {
        return getNumberA()*getNumberB();
    }
}
