package com.design.model.template.impl;

import com.design.model.template.AbstractLife;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-08 18:38:21
 **/
public class SonRichLife extends AbstractLife {

    private String name;

    public SonRichLife(String name) {
        this.name = name;
        System.out.println(name+"一天的生活...");
    }

    @Override
    protected void eat() {
        System.out.println("海鲜陪酒...");
    }

    @Override
    protected void other() {
        System.out.println("把妹，泡妞...");
    }
}
