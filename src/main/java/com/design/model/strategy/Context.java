package com.design.model.strategy;

/**
 * Description: 封装策略类
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-08-31 15:55:48
 **/
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int compute(int x,int y){
        return strategy.operation(x, y);
    }
}
