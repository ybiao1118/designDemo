package com.design.observer;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void test(){
        MessagePushed messagePushed=new MessagePushed();
        ReceiveMessage r1=new ReceiveMessage("张三");
        ReceiveMessage r2=new ReceiveMessage("李四");
        ReceiveMessage r3=new ReceiveMessage("王五");
        messagePushed.addObserve(r1);
        messagePushed.addObserve(r2);
        messagePushed.addObserve(r3);
        messagePushed.sendMsg("复联四上映啦");
        messagePushed.deleteObserver(r3);
        messagePushed.sendMsg("钢铁侠死掉了");
    }
}
