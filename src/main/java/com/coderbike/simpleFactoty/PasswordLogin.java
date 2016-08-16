package com.coderbike.simpleFactoty;

/**
 * <p>密码登陆<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/16 10:06
 */
public class PasswordLogin implements Login {

    public boolean verify(String username, String password) {
        if ("imant".equals(username) && "123456".equals(password)) {
            return true;
        }
        return false;
    }
}
