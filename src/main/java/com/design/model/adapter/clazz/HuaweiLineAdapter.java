package com.design.model.adapter.clazz;

import com.design.model.adapter.obj.FoxconnAppleLine;
import com.design.model.adapter.obj.IHuaweiLine;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-03 11:44:06
 **/
public class HuaweiLineAdapter extends FoxconnAppleLine implements IHuaweiLine {

    @Override
    public void cTypeOutputHeader() {
        System.out.println("华为tyoe-c接口转换器..");
        super.aTypeOutputHeader();
    }
}
