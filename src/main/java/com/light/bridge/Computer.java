package com.light.bridge;

/**
 * 电脑类型抽象类
 * @Author : KangXu
 * @Date : 2020/9/21
 * @Package : bridge
 */

public abstract class Computer {
    //组合品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();          //品牌信息
    }
}
