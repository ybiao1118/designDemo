package com.design.factory;

public class SubOperatorFactory implements OperatorFactory {
    @Override
    public Operator createOperator() {
        return new SubOperator();
    }
}
