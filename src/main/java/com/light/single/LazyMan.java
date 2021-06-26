package com.light.single;

/**
 * 懒汉式单例模式
 * 双重校验锁 DCL 从而实现线程的安全
 * @Author : KangXu
 * @Date : 2020/9/21
 * @Package : light
 */

public class LazyMan {
    private LazyMan() {
        System.out.println(Thread.currentThread().getName());
    }

    private volatile static LazyMan lazyMan;        //避免指令重排

    public static LazyMan getInstance() {
        if (null == lazyMan) {
            synchronized (LazyMan.class) {
                if (null == lazyMan) {
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(LazyMan::getInstance).start();
        }
    }
}
