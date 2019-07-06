package com.design.model.factory.normal.impl;

import com.design.model.factory.*;
import com.design.model.factory.example.Vehicle551;
import com.design.model.factory.example.Vehicle553;
import com.design.model.factory.normal.VehicleFactory;

/**
 * Description: 单号车辆版本工厂
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 14:25:51
 **/
public class OddVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String version) {
        if (version.equals("551")) {
            return new Vehicle551();
        } else if (version.equals("553")) {
            return new Vehicle553();
        } else {
            return new Vehicle551();
        }
    }
}
