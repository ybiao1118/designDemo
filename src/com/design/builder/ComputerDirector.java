package com.design.builder;
//指挥着，怎么实现建造者
public class ComputerDirector {
    public Computer construct(Builder builder) {
        // 逐步构建复杂产品对象
        Computer computer;
        builder.buildBrand();
        builder.buildCPU();
        builder.buildDisplayCard();
        builder.buildHardDisk();
        builder.buildMainBoard();
        builder.buildMemory();
        builder.buildPower();
        computer = builder.createComputer();
        return computer;
    }

}
