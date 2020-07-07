package com.design.factory;

public class DivOperator extends Operator {
    @Override
    protected double getResult() throws Exception {
        if(getNumberB()==0.0){
            throw new Exception("除数不能为0");
        }else{
            return getNumberA()/getNumberB();
        }

    }
}
