package com.design.model.decorator;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-04 16:12:07
 **/
public abstract class DecoratorOrder implements IOrder{

    private IOrder order;

    public DecoratorOrder(IOrder order) {
        this.order = order;
    }

    @Override
    public void orderInfo() {
        order.orderInfo();
    }
}
