package com.design.model.factory.group.impl;

import com.design.model.factory.*;
import com.design.model.factory.example.Dept552;
import com.design.model.factory.example.Vehicle552;
import com.design.model.factory.group.ZucheFactory;

/**
 * Description: 租车552整合逻辑
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 16:51:01
 **/
public class Zuche552Factory implements ZucheFactory {
    @Override
    public Dept createDept() {
        return new Dept552();
    }

    @Override
    public Vehicle createVehicle() {
        return new Vehicle552();
    }
}
