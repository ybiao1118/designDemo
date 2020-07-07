package com.design.command;

import org.junit.Test;

public class CommandTest {
    @Test
    public  void  test(){
        //创建电灯命令
        LightCommand lightCommand=new LightCommand(new Light());
        //创建电视命令
        TVCommand tvCommand=new TVCommand(new TV());
        //创建遥控器
        Switch s=new Switch();
        //将命令加入遥控器
        s.setCommand(lightCommand);
        s.setCommand(tvCommand);
        //执行命令
        s.on(1);
        s.on(2);
        s.off(1);
        s.off(2);
    }
}
