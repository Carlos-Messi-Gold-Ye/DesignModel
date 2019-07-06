package com.design.model.factory;

import com.design.model.factory.group.ZucheFactory;
import com.design.model.factory.group.impl.Zuche551Factory;
import com.design.model.factory.normal.DeptFactory;
import com.design.model.factory.normal.VehicleFactory;
import com.design.model.factory.normal.impl.EvenDeptFactory;
import com.design.model.factory.normal.impl.OddVehicleFactory;

/**
 * Description: 抽象工厂模式
 * <p>多对象有关联性，由工厂同一创建</p>
 * <p>如：551版与552版不兼容，单个单个的创建，再组合客户端就需要知道更多</p>
 *
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 16:54:49
 **/
public class AppGroup {

    public static void main(String[] args) {
        ZucheFactory zucheFactory = new Zuche551Factory();
        Dept dept = zucheFactory.createDept();
        Vehicle vehicle = zucheFactory.createVehicle();
        Zuche zuche = new Zuche(dept, vehicle);
        zuche.operation();
        normal();
    }

    /**
     * 多个工厂模式组合
     */
    private static void normal(){
        //必须明确指定多个工厂，否则可能出现各自工厂间生产的产品无法适配，如dept是551，vehicle是552，可能不兼容
        DeptFactory deptFactory = new EvenDeptFactory();
        VehicleFactory vehicleFactory = new OddVehicleFactory();
        Dept dept = deptFactory.createDept("551");
        Vehicle vehicle = vehicleFactory.createVehicle("552");
        Zuche zuche = new Zuche(dept, vehicle);
        zuche.operation();
    }
}
