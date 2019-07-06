package com.design.model.factory.normal.impl;

import com.design.model.factory.Vehicle;
import com.design.model.factory.example.Vehicle550;
import com.design.model.factory.example.Vehicle552;
import com.design.model.factory.normal.VehicleFactory;

/**
 * Description: 双号车辆版本工厂
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 14:25:51
 **/
public class EvenVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String version) {
        if (version.equals("550")) {
            return new Vehicle550();
        } else if (version.equals("552")) {
            return new Vehicle552();
        } else {
            return new Vehicle550();
        }
    }
}
