package com.design.model.adapter.base;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-03 10:55:08
 **/
public interface IListener {

    void onStart();

    void onCreate();

    void onChange();

    void onDelete();

    void onStop();
}
