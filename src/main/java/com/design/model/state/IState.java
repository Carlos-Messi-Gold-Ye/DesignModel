package com.design.model.state;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-11 17:20:29
 **/
public interface IState {

    void setContext(Context context);
    void inShop();
    void repairing();
    void rent();
}
