package com.light.proxy;

/**
 * 静态代理类
 * @Author : KangXu
 * @Date : 2020/9/22
 * @Package : proxy
 */

public class StaticProxy implements Rent {
    //组合房主
    private Host host;

    public StaticProxy(Host host) {
        this.host = host;
    }

    //中介带领看房子
    public void see() {
        System.out.println("中介带领看房子");
    }

    //签订租赁合同
    public void sign() {
        System.out.println("签订租赁合同");
    }

    //房屋出租
    public void rent() {
        this.see();
        host.rent();
        this.sign();
    }


    public static void main(String[] args) {
        //生成静态代理对象
        StaticProxy proxy = new StaticProxy(new Host());
        proxy.rent();
    }
}
