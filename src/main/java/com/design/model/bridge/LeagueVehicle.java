package com.design.model.bridge;

/**
 * Description: 加盟车辆
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-07 11:24:39
 **/
public class LeagueVehicle implements IVehicle{

    @Override
    public void affiliation() {
        System.out.println("加盟车辆.");
    }

    @Override
    public int rental() {
        return 120;
    }
}
