package com.light.proxy;

/**
 * 房主类
 * @Author : KangXu
 * @Date : 2020/9/22
 * @Package : proxy
 */

public class Host implements Rent {
    public Host() {
    }

    public void rent() {
        System.out.println("房主的房子要出租");
    }
}
