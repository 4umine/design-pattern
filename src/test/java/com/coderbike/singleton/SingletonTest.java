package com.coderbike.singleton;

import org.junit.Test;

/**
 * <p>描述<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/22 15:49
 */
public class SingletonTest {

    /**
     * 测试类级类+多线程缺省同步锁实现的单例模式
     */
    @Test
    public void lazyInitializationClassTest() {
        LazyInitializationClassSingleton singleton = LazyInitializationClassSingleton.getInstance();
        singleton.printStr();
        System.out.println(singleton);
    }

    /**
     * 枚举实现单例模式（真尼玛简单）
     */
    @Test
    public void enumTest() {
        EnumSingleton singleton = EnumSingleton.uniqueSingleton;
        singleton.printStr();
    }
}
