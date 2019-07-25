package com.design.model.proxy;

import com.design.model.proxy.general.IPay;
import com.design.model.proxy.general.impl.PayAipayProxy;
import com.design.model.proxy.general.impl.PayUtilities;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-25 16:57:43
 **/
public class AppGeneral {

    public static void main(String[] args) {
        IPay payUtilities = new PayUtilities("梅西");
        IPay payProxy = new PayAipayProxy(payUtilities);
        payProxy.pay();
    }
}
