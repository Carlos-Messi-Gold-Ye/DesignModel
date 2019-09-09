package com.design.model.chain;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-09 11:00:43
 **/
public class DirectorLeader extends AbstractLeader {

    private static final int DIRECTOR_DAYS = 7;

    @Override
    protected int limitDays() {
        return DIRECTOR_DAYS;
    }

    @Override
    protected String suggestion() {
        return "总监同意.";
    }

}
