package com.design.model.prototype;

import java.util.UUID;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-30 16:01:37
 **/
public class App {

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        handwork();
        System.out.println("手工生产耗时：" + (System.currentTimeMillis() - time1));
        time1 = System.currentTimeMillis();
        prototype();
        System.out.println("原型生产耗时：" + (System.currentTimeMillis() - time1));
    }

    private static void prototype() {
        Toy toyPrototype = new Toy(50, "小猪佩奇");
        Toy toy;
        for (int i = 0; i < 1000; i++) {
            try {
                toy = toyPrototype.prototype();
                toy.setDrop("吊牌：" + UUID.randomUUID());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void handwork() {
        Toy toy;
        for (int i = 0; i < 1000; i++) {
            toy = new Toy(50, "小猪佩奇");
            toy.setDrop("吊牌：" + UUID.randomUUID());
        }
    }

}
