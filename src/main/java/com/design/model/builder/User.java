package com.design.model.builder;

import lombok.Builder;
import lombok.Data;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-08 16:11:19
 **/
@Builder
public class User {

    private String name;
    private String password;
    private String mobile;

    public User(final String name, final String password, final String mobile) {
        this.name = name;
        this.password = password;
        this.mobile = mobile;
    }
}
