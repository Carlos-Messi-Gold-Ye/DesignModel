package com.design.model.decorator;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-04 16:15:13
 **/
public class FranchiseeOrder extends DecoratorOrder{

    public FranchiseeOrder(IOrder order) {
        super(order);
    }

    @Override
    public void orderInfo() {
        super.orderInfo();
        System.out.println("处理加盟店订单信息...");
    }
}
