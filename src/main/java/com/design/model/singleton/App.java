package com.design.model.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Description: 线程安全校验
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-03 15:03:47
 **/
public class App {

    private static ExecutorService executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
            60L, TimeUnit.SECONDS,
            new SynchronousQueue<>());

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                LazySingleton.getInstance();
                HungrySingleton.getInstance();
                DCLSingleton.getInstance();
                StaticInnerClassSingleton.getInstance();
            });
        }
        executor.shutdown();
    }
}
