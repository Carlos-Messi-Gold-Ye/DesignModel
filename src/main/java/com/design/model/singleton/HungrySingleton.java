package com.design.model.singleton;

/**
 * Description: 饿汉式
 * <p>直接加载，多线程安全</p>
 * <p>优点：没有加锁，执行效率提高</p>
 * <p>缺点：类加载即初始化，浪费内存，容易产生垃圾对象，getInstance()没有起到lazy loading效果</p>
 * TODO 对象本就是拿来用的，单例对象，初始化即加载，个人感觉没什么问题，迟早都会用到，用到便占用内存，早点和晚点加载区别不大
 * TODO 单例对象会被JVM回收吗？
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-03 11:38:30
 **/
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("HungrySingleton初始化");
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
