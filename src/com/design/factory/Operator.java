package com.design.factory;

public abstract class Operator {
    private double numberA = 0.0;
    private double numberB = 0.0;

    protected abstract double getResult() throws Exception;
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
