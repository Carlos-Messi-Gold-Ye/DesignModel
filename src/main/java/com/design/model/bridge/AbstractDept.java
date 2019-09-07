package com.design.model.bridge;

/**
 * Description: 门店
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-07 11:16:29
 **/
public abstract class AbstractDept {

    private IVehicle vehicle;

    public AbstractDept(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    protected abstract void type();

    protected abstract int discount();

    public void rentalPostings() {
        type();
        vehicle.affiliation();
        double price = vehicle.rental() * discount() / 100;
        System.out.println("租赁价格：" + price);
    }
}
