package com.design.model.chain;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-09 10:37:27
 **/
public abstract class AbstractLeader implements ILeader {


    private ILeader superiorLeaders;

    @Override
    public final void setSuperior(ILeader superiorLeaders) {
        this.superiorLeaders = superiorLeaders;
    }

    @Override
    public final String approval(IEmployee employee) {
        String msg = suggestion();
        if (employee.leaveDays() > limitDays() && this.superiorLeaders != null) {
            msg = msg + "转上级批准." + "\n" + superiorLeaders.approval(employee);
        }
        return msg;
    }

    protected abstract int limitDays();

    protected abstract String suggestion();

}
