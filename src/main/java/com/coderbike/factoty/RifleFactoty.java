package com.coderbike.factoty;

/**
 * <p>步枪工厂类<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/16 11:38
 */
public class RifleFactoty implements WeaponFactoty {

    /**
     * 生产武器
     *
     * @param weaponType
     */
    public Weapon produceWeapon(String weaponType) {
        if("ak47".equals(weaponType)) {
            return new AK47Weapon();
        } else if ("m4a1".equals(weaponType)) {
            return new M4A1Weapon();
        } else {
            throw new RuntimeException("暂不能生产此类武器");
        }
    }
}
