package com.light.adapter;

/**
 * 电脑类
 * 需要连接转接器
 *
 * @Author : KangXu
 * @Date : 2020/9/14
 * @Package : light.service
 */

public class Computer {
    //电脑连接转接器
    public void net(NetToUsb adapter) {
        adapter.handlerRequest();
    }

    //测试方法
    public static void main(String[] args) {
        Computer computer = new Computer();
        Network network = new Network();
        Adapter adapter = new Adapter(network);
        computer.net(adapter);
    }
}
