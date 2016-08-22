package com.coderbike.singleton;

/**
 * <p>
 *     懒汉模式，顾名思义，就是要用的时候在创建实例
 *     典型的时间换空间
 * <p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/22 14:17
 */
public class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton() {

    }

    /**
     * <p>方法使用同步，而且每次要检查是否为null，影响速度<p/>
     * author: liubingguang
     * date: 2016/8/22 14:20
     *
     * @param
     */
    public synchronized static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
