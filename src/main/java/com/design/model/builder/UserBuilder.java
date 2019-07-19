package com.design.model.builder;

import org.springframework.util.StringUtils;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-08 16:41:36
 **/
public class UserBuilder {
    private String name;
    private String password;
    private String mobile;

    UserBuilder() {
    }

    public UserBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public UserBuilder password(final String password) {
        this.password = password;
        return this;
    }

    public UserBuilder mobile(final String mobile) {
        this.mobile = mobile;
        return this;
    }

    public UserBuilder check(){
        if(StringUtils.isEmpty(name)){
            throw new RuntimeException("name空了");
        }
        if(StringUtils.isEmpty(password)){
            throw new RuntimeException("password空了");
        }
        if(StringUtils.isEmpty(mobile)){
            throw new RuntimeException("mobile空了");
        }
        return this;
    }

    public User build() {
        return new User(this.name, this.password, this.mobile);
    }
}
