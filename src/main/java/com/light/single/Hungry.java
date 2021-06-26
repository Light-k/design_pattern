package com.light.single;

/**
 * 饿汉式单例模式
 * 程序一开始就创建了对象
 * @Author : KangXu
 * @Date : 2020/9/21
 * @Package : light
 */

public class Hungry {
    private Hungry() {
        System.out.println(Thread.currentThread().getName());
    }

    private final static Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(Hungry::getInstance).start();
        }

    }
}
