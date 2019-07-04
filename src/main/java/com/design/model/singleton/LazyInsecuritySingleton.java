package com.design.model.singleton;

/**
 * Description: 懒汉式，线程不安全
 * <p>懒加载，不支持多线程，多线程下，getInstance()返回的对象可能不是同一个<p/>
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-03 11:16:32
 **/
public class LazyInsecuritySingleton {

    private static LazyInsecuritySingleton instance;

    private LazyInsecuritySingleton() {
        System.out.println("LazyInsecuritySingleton初始化");
    }

    public static LazyInsecuritySingleton getInstance() {
        if (instance == null) {
            instance = new LazyInsecuritySingleton();
        }
        return instance;
    }
}
