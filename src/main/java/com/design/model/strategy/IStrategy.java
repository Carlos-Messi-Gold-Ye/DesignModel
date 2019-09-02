package com.design.model.strategy;

/**
 * Description: 策略算法接口
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-08-31 14:03:27
 **/
public interface IStrategy {

    /**
     * 具体算法操作
     * @param x 入参1
     * @param y 入参2
     * @return 算法计算结果
     */
    int operation(int x, int y);

}
