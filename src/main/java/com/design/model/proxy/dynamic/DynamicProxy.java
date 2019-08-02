package com.design.model.proxy.dynamic;

import com.design.model.proxy.general.IPay;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-25 17:25:17
 **/
public class DynamicProxy implements InvocationHandler {

    private IPay iPay;

    public DynamicProxy(IPay iPay) {
        this.iPay = iPay;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理缴费开始..");
        method.invoke(iPay, args);
        System.out.println("代理缴费完成..");
        return null;
    }
}
