package com.coderbike.simpleFactoty;

/**
 * <p>登陆管理类，负责创建登陆实例<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/16 10:10
 */
public class LoginManager {

    /**
     * <p>创建登陆实例工厂类<p/>
     * author: liubingguang
     * date: 2016/8/16 10:12
     *
     * @param loginType 登陆类型
     */
    public static Login factoty(String loginType) {
        if ("password".equals(loginType)) {
            return new PasswordLogin();
        } else if ("domain".equals(loginType)) {
            return new DomainLogin();
        } else {
            throw new RuntimeException("登陆类型错误");
        }
    }
}
