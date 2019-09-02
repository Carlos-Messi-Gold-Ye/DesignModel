package com.design.model.strategy;

import com.design.model.strategy.impl.AddStrategy;
import com.design.model.strategy.impl.DivideStrategy;
import com.design.model.strategy.impl.MultiplyStrategy;
import com.design.model.strategy.impl.SubtractStrategy;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-08-31 16:00:22
 **/
public class App {
    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        System.out.println("10 + 5 = " + context.compute(10, 5));

        context = new Context(new SubtractStrategy());
        System.out.println("10 - 5 = " + context.compute(10, 5));

        context = new Context(new MultiplyStrategy());
        System.out.println("10 * 5 = " + context.compute(10, 5));

        context = new Context(new DivideStrategy());
        System.out.println("10 * 5 = " + context.compute(10, 5));
    }
}
