package com.design.model.template.impl;

import com.design.model.template.AbstractLife;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-08 18:38:21
 **/
public class CoderLife extends AbstractLife {

    private String name;

    public CoderLife(String name) {
        this.name = name;
        System.out.println(name+"一天的生活...");
    }

    @Override
    protected void other() {
        System.out.println("写BUG，改BUG...");
    }
}
