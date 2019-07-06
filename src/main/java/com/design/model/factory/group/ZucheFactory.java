package com.design.model.factory.group;

import com.design.model.factory.Dept;
import com.design.model.factory.Vehicle;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 16:49:02
 **/
public interface ZucheFactory {
    Dept createDept();
    Vehicle createVehicle();
}
