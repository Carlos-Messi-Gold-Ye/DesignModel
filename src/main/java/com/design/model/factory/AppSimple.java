package com.design.model.factory;

import com.design.model.factory.simple.SimpleVehicleFactory;

/**
 * Description: 简单工厂
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 14:08:07
 **/
public class AppSimple {

    public static void main(String[] args) {
        Vehicle vehicle = SimpleVehicleFactory.createVehicle("551");
        vehicle.doSomething();
    }
}
