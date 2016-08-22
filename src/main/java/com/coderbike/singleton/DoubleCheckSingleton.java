package com.coderbike.singleton;

/**
 * <p>
 *     双重检查机制单利模式
 *     获取实例仅第一次需同步
 * <p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/22 14:22
 */
public class DoubleCheckSingleton {

    /**
     * 被volatile修饰的变量，将不会被本地线程缓存，所有对该变量的读写操作都是直接操作共享内存的，
     * 确保多个线程能够正确的处理该变量
     */
    private volatile static DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton() {}

    /**
     * <p>
     *     只有singleton不为空才用同步
     *     另外同步对象为什么是DoubleLockSingleton.class
     *     因为执行静态成员是属于类对象的，也就是DoubleLockSingleton.class
     *     创建类对象的三种方式：
     *     1，Class.forName("类的权限命名");
     *     2，类名.class
     *     3，实例.getClass();
     *
     * <p/>
     * author: liubingguang
     * date: 2016/8/22 14:30
     *
     * @param
     */
    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
