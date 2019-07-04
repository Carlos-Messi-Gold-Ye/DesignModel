package com.design.model.singleton;

/**
 * Description: 登记式/静态内部类
 * <p>懒加载，多线程安全，达到双检锁方式一样的功效</p>
 * <p>Singleton 类被装载了，instance 不一定被初始化。
 *    因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance</p>
 *  TODO static装载原理? 类 方法 属性 内部静态...
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-03 14:34:58
 **/
public class StaticInnerClassSingleton {

    private static class StaticInnerClassSingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
        System.out.println("StaticInnerClassSingleton初始化");
    }

    public static final StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonHolder.INSTANCE;
    }
}
