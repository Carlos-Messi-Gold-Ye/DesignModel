package com.design.model.factory.normal.impl;

import com.design.model.factory.Dept;
import com.design.model.factory.example.Dept550;
import com.design.model.factory.example.Dept552;
import com.design.model.factory.normal.DeptFactory;

/**
 * Description: 双号车辆版本工厂
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 14:25:51
 **/
public class EvenDeptFactory implements DeptFactory {
    @Override
    public Dept createDept(String version) {
        if (version.equals("550")) {
            return new Dept550();
        } else if (version.equals("552")) {
            return new Dept552();
        } else {
            return new Dept550();
        }
    }
}
