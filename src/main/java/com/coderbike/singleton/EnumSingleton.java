package com.coderbike.singleton;

/**
 * <p>枚举实现单利<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/22 15:46
 */
public enum EnumSingleton {

    uniqueSingleton;

    public void printStr() {
        System.out.println("enum singleton!");
    }
}
