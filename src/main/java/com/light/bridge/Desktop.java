package com.light.bridge;

/**
 * 台式电脑类型
 * @Author : KangXu
 * @Date : 2020/9/21
 * @Package : bridge
 */
public class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式电脑");
    }
}
