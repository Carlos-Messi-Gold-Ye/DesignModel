package com.design.model.factory.simple;

import com.design.model.factory.Vehicle;
import com.design.model.factory.example.Vehicle550;
import com.design.model.factory.example.Vehicle551;

/**
 * Description: 简单工厂类
 * <p>简单工厂模式通常是：一个工厂类 XxxFactory，里面有一个静态方法，根据我们不同的参数，返回不同的派生自同一个父类（或实现同一接口）的实例对象。</p>
 * <p>职责单一原则，一个类只提供一种功能，VehicleFactory 的功能就是只要负责生产各种 Vehicle。</p>
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-04 18:10:47
 **/
public class SimpleVehicleFactory {
    public static Vehicle createVehicle(String version) {
        if (version.equals("550")) {
            return new Vehicle550();
        } else if (version.equals("551")) {
            return new Vehicle551();
        } else {
            return new Vehicle550();
        }
    }
}
