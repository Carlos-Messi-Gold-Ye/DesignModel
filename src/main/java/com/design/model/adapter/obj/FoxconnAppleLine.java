package com.design.model.adapter.obj;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-03 11:09:09
 **/
public class FoxconnAppleLine implements IAppleLine {

    @Override
    public void usbInputHeader() {
        System.out.println("Usb电源输入接头...");
    }

    @Override
    public void aTypeOutputHeader() {
        System.out.println("apple扁头输出接头...");
    }
}
