package com.design.composite;
//部门类（树叶）
public class Department extends Company{
    private String name;
    public Department(String name){
        this.name=name;
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
    }

}
