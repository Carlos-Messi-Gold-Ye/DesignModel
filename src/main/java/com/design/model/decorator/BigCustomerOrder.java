package com.design.model.decorator;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-04 16:15:13
 **/
public class BigCustomerOrder extends DecoratorOrder{

    public BigCustomerOrder(IOrder order) {
        super(order);
    }

    @Override
    public void orderInfo() {
        super.orderInfo();
        System.out.println("处理大客户订单信息...");
    }
}
