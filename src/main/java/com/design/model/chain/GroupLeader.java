package com.design.model.chain;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-09 11:00:43
 **/
public class GroupLeader extends AbstractLeader {

    private static final int GROUP_DAYS = 3;

    @Override
    protected int limitDays() {
        return GROUP_DAYS;
    }

    @Override
    protected String suggestion() {
        return "组长同意.";
    }
}
