package com.design.model.state;

import com.design.model.state.impl.InShopState;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-11 17:39:38
 **/
public class App {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new InShopState());
        context.inShop();
        context.repairing();
        context.inShop();
        context.rent();
        context.repairing();
    }
}
