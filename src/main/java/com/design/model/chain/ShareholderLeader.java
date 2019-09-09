package com.design.model.chain;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-09 11:00:43
 **/
public class ShareholderLeader extends AbstractLeader {

    private final static int SHAREHOLDER_DAYS = Integer.MAX_VALUE;

    @Override
    protected int limitDays() {
        return SHAREHOLDER_DAYS;
    }

    @Override
    protected String suggestion() {
        return "董事会同意.";
    }
}
