package com.design.model.bridge;

/**
 * Description: 集团车辆
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-07 11:24:39
 **/
public class BlocVehicle implements IVehicle{

    @Override
    public void affiliation() {
        System.out.println("集团车辆.");
    }

    @Override
    public int rental() {
        return 100;
    }
}
