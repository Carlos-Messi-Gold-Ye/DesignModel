package com.design.model.singleton;

/**
 * Description: 懒汉式，线程安全
 * <p>懒加载，支持多线程，但是效率低下，实际情况需要同步的情况极低</p>
 * <p>优点：当第一次调用时才初始化，适当减轻内存浪费</p>
 * <p>缺点：synchronized影响一定的性能效率</p>
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-03 11:16:32
 **/
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton初始化");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
