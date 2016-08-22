package com.coderbike.singleton;

/**
 * <p>
 *     饿汉模式，顾名思义，就是想快点创建
 *     典型的空间换时间
 * <p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/22 14:15
 */
public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {

    }

    /**
     * <p>实例在加载类的时候就被创建，所以在这里不用判断<p/>
     * author: liubingguang
     * date: 2016/8/22 14:16
     *
     * @param
     */
    public static EagerSingleton getInstance() {
        return singleton;
    }
}
