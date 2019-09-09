package com.design.model.chain;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-09 11:10:09
 **/
public interface ILeader {

    void setSuperior(ILeader superiorLeaders);

    String approval(IEmployee employee);

}
