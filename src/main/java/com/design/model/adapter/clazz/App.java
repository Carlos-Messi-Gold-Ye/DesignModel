package com.design.model.adapter.clazz;

import com.design.model.adapter.obj.IHuaweiLine;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-03 11:13:35
 **/
public class App {

    public static void main(String[] args) {
        IHuaweiLine huaweiLine = new HuaweiLineAdapter();
        huaweiLine.cTypeOutputHeader();
        // ...拿去充你的华为手机吧...
    }
}
