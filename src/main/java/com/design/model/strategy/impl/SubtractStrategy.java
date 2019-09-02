package com.design.model.strategy.impl;

import com.design.model.strategy.IStrategy;

/**
 * Description: 减法策略
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-08-31 15:51:42
 **/
public class SubtractStrategy implements IStrategy {
    @Override
    public int operation(int x, int y) {
        return x - y;
    }
}
