package com.light.adapter;

/**
 * 对象适配器
 * 适配usb和网线
 * @Author : KangXu
 * @Date : 2020/9/14
 * @Package : light
 */
public class Adapter implements NetToUsb {
    //组合网线对象
    private Network network;

    public Adapter(Network network) {
        this.network = network;
    }

    //适配usb并连接网线
    public void handlerRequest() {
        network.request();
    }
}
