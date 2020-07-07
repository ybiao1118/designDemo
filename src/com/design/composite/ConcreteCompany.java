package com.design.composite;

import java.util.ArrayList;

//具体公司类(树枝构件)
public class ConcreteCompany  extends  Company{
    private ArrayList<Company> list;
    private String name;
    public ConcreteCompany(String name){
        this.name=name;
        this.list=new ArrayList<Company>();
    }
    public String getName() {
        return name;
    }

    @Override
    public void display(int depth) {
        StringBuffer strBuf = new StringBuffer("");
        for (int i = 0; i < depth; i++) {
            strBuf.append("--");
        }
        System.out.println(new String(strBuf) + this.getName());
        for (Company c : list) {
            c.display(depth + 1);
        }
    }
    public void add(Company company){
        list.add(company);
    }
    public void remove(Company company){
        list.remove(company);
    }
}
