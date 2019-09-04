package com.design.model.adapter.base;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-03 10:57:38
 **/
public class ListenerMonitor extends ListenerAdaptor{

    @Override
    public void onStart() {
        System.out.println("Start...monitor");
    }

    @Override
    public void onStop() {
        System.out.println("Stop...monitor");
    }
}
