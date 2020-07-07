package com.design.factory;

public class AddOperatorFactory implements OperatorFactory {
    @Override
    public Operator createOperator() {
        return new AddOperator();
    }
}
