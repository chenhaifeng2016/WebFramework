package com.cssweb.passport.account.pojo;

import java.io.Serializable;

/**
 * Created by chenh on 2016/6/24.
 */
public class Account implements Serializable {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
