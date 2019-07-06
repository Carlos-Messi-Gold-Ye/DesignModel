package com.design.model.factory.group.impl;

import com.design.model.factory.Dept;
import com.design.model.factory.example.Dept551;
import com.design.model.factory.Vehicle;
import com.design.model.factory.example.Vehicle551;
import com.design.model.factory.group.ZucheFactory;

/**
 * Description: 租车551整合逻辑
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 16:51:01
 **/
public class Zuche551Factory implements ZucheFactory {
    @Override
    public Dept createDept() {
        return new Dept551();
    }

    @Override
    public Vehicle createVehicle() {
        return new Vehicle551();
    }
}
