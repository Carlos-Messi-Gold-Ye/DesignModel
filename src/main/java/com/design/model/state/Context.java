package com.design.model.state;

import com.design.model.state.impl.InShopState;
import com.design.model.state.impl.RepairingState;
import com.design.model.state.impl.RentState;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-11 17:32:22
 **/
public class Context {

    public static final IState IN_SHOP = new InShopState();
    public static final IState REPAIRING = new RepairingState();
    public static final IState RENT = new RentState();

    private IState state;

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void inShop() {
        this.state.inShop();
    }


    public void repairing() {
        this.state.repairing();
    }


    public void rent() {
        this.state.rent();
    }

}
