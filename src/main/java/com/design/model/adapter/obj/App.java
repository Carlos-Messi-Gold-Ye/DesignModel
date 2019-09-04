package com.design.model.adapter.obj;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-03 11:13:35
 **/
public class App {

    public static void main(String[] args) {
        IAppleLine appleLine = new FoxconnAppleLine();
        IHuaweiLine huaweiLine = new HuaweiLineAdapter(appleLine);
        huaweiLine.cTypeOutputHeader();
        // ...拿去充你的华为手机吧...
    }
}
