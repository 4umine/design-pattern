package com.coderbike.factoty;

import org.junit.Test;

/**
 * <p>工厂模式测试类<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/16 13:36
 */
public class WeaponTest {

    @Test
    public void rifleTest() {
        String weaponType = "ak47";

        WeaponFactoty rifleFactoty = new RifleFactoty();
        Weapon weapon = rifleFactoty.produceWeapon(weaponType);
        weapon.fire();//ak47 fire
    }

    @Test
    public void sniperTest() {
        String weaponType = "awm";

        WeaponFactoty sniperFactory = new SniperFactory();
        Weapon weapon = sniperFactory.produceWeapon(weaponType);
        weapon.fire();//awm fire
    }
}
