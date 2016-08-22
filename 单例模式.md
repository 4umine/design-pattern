# 单例模式实现的几种方式

## 饿汉模式
类加载的时候就创建Singleton，空间换时间

```java
private static Sinleton singleton = new Singleton();
```

## 懒汉模式
需要的时候再实例化

```java
public synchronized static Sinleton getInstance() {
    if (singleton == null) {
        singleton = new LazySingleton();
    }
    return singleton;
}
```

## DCL模式（Double Checked Locking）
针对饿汉模式进行优化，不用每次都同步
注意要用volatile关键字，被它修饰的变量，不会被本地线程缓存，对这个变量的所有操作直接存到共享内存

```java
private static Singleton singleton = null;
public static Sinleton getInstance() {
    if (singleton == null) {
        synchronized(Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
    }
    return singleton;
}
```

## 内部类模式
类级内部类+JVM隐含同步

```java
private static class SingletonHolder {
    private static Singleton singleton = new Singleton();
}
public static Singleton getInstance() {
    return SingletonHolder.singleton;
}
```

## 枚举
写起来真简单

```java
public enum Singleton {
    SINGLETON;
    public void printStr() {
        System.out.println("enum singleton!");
    }
}
public void test() {
    Singleton singleton = Singleton.SINGLETON;
    singleton.printStr();
}
```