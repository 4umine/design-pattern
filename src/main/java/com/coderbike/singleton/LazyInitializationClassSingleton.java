package com.coderbike.singleton;

/**
 * <p>
 *     Lazy Initialization Holder Class 模式
 *     这种模式利用了两点：
 *     1，类级内部类，使用时才会加载（饿汉模式）
 *     2，多线程缺省同步锁（由JVM隐式执行同步）
 *          1，由静态初始化器（static修饰的变量或者static{...}）初始化数据
 *          2，final修饰的变量
 *          （下面这两个什么鬼）
 *          3，在创建线程之前创建对象
 *          4，线程可以看见它将要创建的对象
 * <p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/22 14:47
 */
public class LazyInitializationClassSingleton {

    private LazyInitializationClassSingleton() {}

    /**
     * <p>
     *     类级内部类：static修饰的内部类
     *     类级内部类相当于外部类的成员，只有第一次使用时才会加载
     * <p/>
     * author: liubingguang
     * date: 2016/8/22 14:55
     */
    private static class SingletonHolder {

        /**
         * 被static修饰的变量或者stati{}默认是线程安全的
         */
        private static LazyInitializationClassSingleton singleton = new LazyInitializationClassSingleton();
    }

    public static LazyInitializationClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    public void printStr() {
        System.out.println("LazyInitializationClassSingleton test!");
    }
}
