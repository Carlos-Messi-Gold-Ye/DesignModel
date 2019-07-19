package com.design.model.template;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-08 18:30:49
 **/
public abstract class AbstractLife {

    protected void wake(){
        System.out.println("起床...");
    }

    protected void eat(){
        System.out.println("随便吃点...");
    }

    protected abstract void other();

    protected void sleep(){
        System.out.println("睡觉...");
    }

    public void oneDayInLife(){
        wake();
        eat();
        other();
        sleep();
    }
}
