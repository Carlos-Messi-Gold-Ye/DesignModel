package com.design.model.factory.normal;

import com.design.model.factory.Dept;
import com.design.model.factory.Vehicle;

/**
 * Description: 工厂模式
 * <p>简单工厂模式很简单，但有些情况是没法满足需求的</p>
 * <p>往往需要使用两个或两个以上的工厂，即工厂模式</p>
 * <p>核心在于，我们需要在第一步选好我们需要的工厂，进而指定工厂去生产什么产品</p>
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-05 14:17:40
 **/
public interface DeptFactory {
    Dept createDept(String version);
}
