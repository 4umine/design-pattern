package com.coderbike.factoty;

/**
 * <p>狙击枪工厂类<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/16 13:26
 */
public class SniperFactory implements WeaponFactoty {

    /**
     * 生产武器
     *
     * @param weaponType
     */
    public Weapon produceWeapon(String weaponType) {
        if("barrett".equals(weaponType)) {
            return new BarrettWeapon();
        } else if ("awm".equals(weaponType)) {
            return new AWMWeapon();
        } else {
            throw new RuntimeException("暂不能生产此类武器");
        }
    }
}
