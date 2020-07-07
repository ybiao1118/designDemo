package com.design.factory;

public class DivOperatorFactory implements OperatorFactory {
    @Override
    public Operator createOperator() {
        return new DivOperator();
    }
}
