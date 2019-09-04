package com.design.model.decorator;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-04 16:09:55
 **/
public class BasisOrder implements IOrder{
    @Override
    public void orderInfo() {
        System.out.println("订单基础信息..");
    }
}
