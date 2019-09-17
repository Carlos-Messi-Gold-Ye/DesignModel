package com.design.model.state.impl;

import com.design.model.state.AbstractState;
import com.design.model.state.Context;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-11 17:37:46
 **/
public class RepairingState extends AbstractState {

    @Override
    public void inShop() {
        super.context.setState(Context.IN_SHOP);
        super.context.inShop();
    }

    @Override
    public void repairing() {
        System.out.println("维修中...");
    }

    @Override
    public void rent() {
        System.out.println("车还在维修，需要等待一会...");
    }
}
