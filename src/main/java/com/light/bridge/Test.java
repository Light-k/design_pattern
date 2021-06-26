package com.light.bridge;

/**
 * 桥接模式测试类
 * @Author : KangXu
 * @Date : 2020/9/21
 * @Package : light
 */

public class Test {
    public static void main(String[] args) {
        //戴尔笔记本
        Laptop laptop = new Laptop(new Dell());
        laptop.info();
        System.out.println("---------------");
        //苹果台式机
        Desktop desktop = new Desktop(new Apple());
        desktop.info();
    }
}
