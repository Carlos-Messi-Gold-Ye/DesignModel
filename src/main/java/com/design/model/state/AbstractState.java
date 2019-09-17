package com.design.model.state;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-11 17:36:22
 **/
public abstract class AbstractState implements IState{

    protected Context context;

    @Override
    public final void setContext(Context context) {
        this.context = context;
    }
}
