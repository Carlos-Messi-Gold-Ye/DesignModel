package com.design.model.proxy.general.impl;

import com.design.model.proxy.general.IPay;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-25 16:55:17
 **/
public class PayAipayProxy implements IPay {
    private IPay pay;

    public PayAipayProxy(IPay pay) {
        this.pay = pay;
    }

    @Override
    public void pay() {
        System.out.println("支付宝代缴开始..");
        pay.pay();
        System.out.println("支付宝代缴成功..");
    }
}
