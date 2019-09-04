package com.design.model.decorator;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-04 16:17:18
 **/
public class App {

    public static void main(String[] args) {
        IOrder order = new BigCustomerOrder(new FranchiseeOrder(new BasisOrder()));
        order.orderInfo();
    }
}
