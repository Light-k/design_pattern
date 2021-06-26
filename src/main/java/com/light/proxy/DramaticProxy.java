package com.light.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类  通过代理接口实现 --> jdk的动态代理
 * 自动生成代理类（不是真实存在的）
 * @Author : KangXu
 * @Date : 2020/9/22
 * @Package : proxy
 */

public class DramaticProxy implements InvocationHandler {
    //组合被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //中介带领看房子
    public void see() {
        System.out.println("中介带领看房子");
    }

    //签订租赁合同
    public void sign() {
        System.out.println("签订租赁合同");
    }

    //自动生成代理对象
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //处理代理实例并返回代理结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.see();
        //动态代理 反射实现
        Object result = method.invoke(target, args);
        this.sign();
        return result;
    }


    public static void main(String[] args) {
        //初始化调用处理程序
        DramaticProxy dramaticProxy = new DramaticProxy();
        //传入要被代理的接口
        dramaticProxy.setTarget(new Host());
        //生成动态代理对象
        Rent proxy = (Rent) dramaticProxy.getProxy();
        proxy.rent();
    }
}
