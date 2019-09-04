package com.design.model.adapter.obj;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-03 11:11:30
 **/
public class HuaweiLineAdapter implements IHuaweiLine{

    private IAppleLine appleLine;

    public HuaweiLineAdapter(IAppleLine appleLine) {
        this.appleLine = appleLine;
    }

    @Override
    public void usbInputHeader() {
        appleLine.usbInputHeader();
    }

    @Override
    public void cTypeOutputHeader() {
        System.out.println("华为tyoe-c接口转换器..");
        appleLine.aTypeOutputHeader();
    }
}
