package com.design.model.chain;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-09 10:51:18
 **/
public class ZucheEmployee implements IEmployee{
    private int days;
    private String reason;

    public ZucheEmployee(int days, String reason) {
        this.days = days;
        this.reason = reason;
    }

    @Override
    public int leaveDays() {
        return days;
    }

    @Override
    public String reason() {
        return reason;
    }
}
