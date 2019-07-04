package com.design.model.singleton;

/**
 * Description: 双检锁/双重校验锁（double-checked locking）
 * <p>懒加载，多线程安全，多线程情况下性能也不错</p>
 * <p>比较复杂，synchronized内移</p>
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-03 11:41:10
 **/
public class DCLSingleton {

    private volatile static DCLSingleton instance;

    private DCLSingleton() {
        System.out.println("DCLSingleton初始化");
    }

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
