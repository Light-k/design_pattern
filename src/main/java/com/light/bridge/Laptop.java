package com.light.bridge;

/**
 * 笔记本类型
 * @Author : KangXu
 * @Date : 2020/9/21
 * @Package : bridge
 */
public class Laptop extends Computer{
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
