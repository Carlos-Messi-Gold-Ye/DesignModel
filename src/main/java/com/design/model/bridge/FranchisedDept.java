package com.design.model.bridge;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-07 14:27:48
 **/
public class FranchisedDept extends AbstractDept {

    public FranchisedDept(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    protected void type() {
        System.out.println("加盟门店..");
    }

    @Override
    protected int discount() {
        return 95;
    }
}
