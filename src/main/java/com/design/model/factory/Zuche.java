package com.design.model.factory;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 16:52:47
 **/
public class Zuche {

    private Dept dept;
    private Vehicle vehicle;

    public Zuche(Dept dept, Vehicle vehicle) {
        this.dept = dept;
        this.vehicle = vehicle;
    }

    public void operation(){
        dept.info();
        vehicle.doSomething();
    }
}
