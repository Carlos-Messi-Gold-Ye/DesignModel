package com.design.model.observer;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-18 17:52:08
 **/
public class Father implements IObserver{
    @Override
    public void update(Object object) {
        System.out.println(object.toString() + ",爸爸去泡奶粉...");
    }
}
