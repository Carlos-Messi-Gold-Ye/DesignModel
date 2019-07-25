package com.design.model.proxy;

import com.design.model.proxy.dynamic.DynamicProxy;
import com.design.model.proxy.general.IPay;
import com.design.model.proxy.general.impl.PayUtilities;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-25 17:26:35
 **/
public class AppDynamic {

    public static void main(String[] args) {
        InvocationHandler handler = new DynamicProxy(new PayUtilities("messi"));
        IPay payProxy = (IPay) Proxy.newProxyInstance(IPay.class.getClassLoader(), new Class[]{IPay.class}, handler);
        payProxy.pay();
    }
}
