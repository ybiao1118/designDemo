package com.design.command;
//电灯命令
public class LightCommand implements Command {
    private Light light;
    public  LightCommand( Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
