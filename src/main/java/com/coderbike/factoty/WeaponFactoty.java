package com.coderbike.factoty;

/**
 * <p>武器工厂类<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/16 11:32
 */
public interface WeaponFactoty {

    /**
     * 生产武器
     */
    Weapon produceWeapon(String weaponType);
}
