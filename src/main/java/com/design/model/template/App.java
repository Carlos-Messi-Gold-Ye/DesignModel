package com.design.model.template;

import com.design.model.template.impl.CoderLife;
import com.design.model.template.impl.SonRichLife;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-08 18:42:50
 **/
public class App {

    public static void main(String[] args) {
        AbstractLife coder = new CoderLife("程序员");
        coder.oneDayInLife();
        System.out.println();
        AbstractLife sonRich = new SonRichLife("富二代");
        sonRich.oneDayInLife();
    }
}
