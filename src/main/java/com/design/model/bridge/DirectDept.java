package com.design.model.bridge;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-07 14:27:48
 **/
public class DirectDept extends AbstractDept {

    public DirectDept(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    protected void type() {
        System.out.println("直营门店..");
    }

    @Override
    protected int discount() {
        return 90;
    }
}
