package com.design.model.chain;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-09 11:00:43
 **/
public class CeoLeader extends AbstractLeader {

    private final static int CEO_DAYS = 15;

    @Override
    protected int limitDays() {
        return CEO_DAYS;
    }

    @Override
    protected String suggestion() {
        return "CEO同意.";
    }
}
