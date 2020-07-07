package com.design.factory;

public class SubOperator extends Operator {
    @Override
    protected double getResult() throws Exception {
        return getNumberA()-getNumberB();
    }
}
