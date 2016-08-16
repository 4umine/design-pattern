package com.coderbike.simpleFactoty;

/**
 * <p>域登陆<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/16 10:08
 */
public class DomainLogin implements Login {

    public boolean verify(String username, String password) {
        if ("imant@outlook.com".equals(username) && "123456".equals(password)) {
            return true;
        }
        return false;
    }
}
