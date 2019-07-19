package com.design.model.builder;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-08 17:01:22
 **/
public class App {

    public static void main(String[] args) {
        User user = new UserBuilder().name("y").password("1").mobile("").check().build();
    }
}
