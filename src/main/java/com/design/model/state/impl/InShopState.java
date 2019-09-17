package com.design.model.state.impl;

import com.design.model.state.AbstractState;
import com.design.model.state.Context;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-11 17:37:46
 **/
public class InShopState extends AbstractState {

    @Override
    public void inShop() {
        System.out.println("归还，在店...");
    }

    @Override
    public void repairing() {
        super.context.setState(Context.REPAIRING);
        super.context.repairing();
    }

    @Override
    public void rent() {
        super.context.setState(Context.RENT);
        super.context.rent();
    }
}
