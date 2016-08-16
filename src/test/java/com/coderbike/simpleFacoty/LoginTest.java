package com.coderbike.simpleFacoty;

import com.coderbike.simpleFactoty.Login;
import com.coderbike.simpleFactoty.LoginManager;
import org.junit.Test;

/**
 * <p>描述<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/8/16 10:14
 */
public class LoginTest {

    @Test
    public void testLogin() {
        String loginTyep = "password";
        String username = "imant";
        String password = "123456";

        Login login = LoginManager.factoty(loginTyep);
        System.out.println(login.verify(username, password));
    }
}
