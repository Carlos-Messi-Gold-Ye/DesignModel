package com.design.model.proxy.general.impl;

import com.design.model.proxy.general.IPay;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-25 16:50:17
 **/
public class PayUtilities implements IPay {
    private String name;

    public PayUtilities(String name) {
        this.name = name;
    }

    @Override
    public void pay() {
        System.out.println("用户" + name + "水电缴费，成功");
    }
}
