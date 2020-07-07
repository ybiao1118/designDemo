package com.design.command;

import java.util.ArrayList;
//遥控器（命令调度者）
public class Switch {
    ArrayList<Command> list;
    public  Switch(){
        list=new ArrayList<Command>();
    }
    public void setCommand(Command command){
        list.add(command);
    }

    public void  on(int index){
        list.get(index-1).execute();
    }
    public void  off(int index){
        list.get(index-1).undo();
    }
}
