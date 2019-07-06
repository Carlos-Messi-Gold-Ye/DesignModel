package com.design.model.factory;

import com.design.model.factory.normal.DeptFactory;
import com.design.model.factory.normal.VehicleFactory;
import com.design.model.factory.normal.impl.EvenDeptFactory;
import com.design.model.factory.normal.impl.OddDeptFactory;
import com.design.model.factory.normal.impl.OddVehicleFactory;
import com.design.model.factory.normal.impl.EvenVehicleFactory;

/**
 * Description: 工厂模式
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 14:08:07
 **/
public class AppNormal {

    public static void main(String[] args) {
        /**
         * 先选择一个具体的工厂
         * 由选择的工厂产生具体的对象，不同的工厂造出不一样的对象
         */
        VehicleFactory evenVehicleFactory = new EvenVehicleFactory();
        Vehicle vehicle = evenVehicleFactory.createVehicle("550");
        vehicle.doSomething();
        VehicleFactory oddVehicleFactory = new OddVehicleFactory();
        vehicle = oddVehicleFactory.createVehicle("551");
        vehicle.doSomething();

        DeptFactory evenDeptFactory = new EvenDeptFactory();
        Dept de = evenDeptFactory.createDept("552");
        de.info();
        DeptFactory oddDeptFactory = new OddDeptFactory();
        de = oddDeptFactory.createDept("553");
        de.info();
    }

}
