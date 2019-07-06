package com.design.model.factory.normal.impl;

import com.design.model.factory.Dept;
import com.design.model.factory.example.Dept551;
import com.design.model.factory.example.Dept553;
import com.design.model.factory.normal.DeptFactory;

/**
 * Description: 单号车辆版本工厂
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 14:25:51
 **/
public class OddDeptFactory implements DeptFactory {
    @Override
    public Dept createDept(String version) {
        if (version.equals("551")) {
            return new Dept551();
        } else if (version.equals("553")) {
            return new Dept553();
        } else {
            return new Dept551();
        }
    }
}
