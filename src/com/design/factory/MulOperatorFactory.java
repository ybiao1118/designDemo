package com.design.factory;

public class MulOperatorFactory implements OperatorFactory {
    @Override
    public Operator createOperator() {
        return new MulOperator();
    }
}
