package com.design.model.state;

import com.design.model.state.impl.InShopState;
import com.design.model.state.impl.RentState;
import com.design.model.state.impl.RepairingState;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-17 16:32:51
 **/
public class StateCounter {

    public static final int IN_SHOP = 0;
    public static final int REPAIRING = 1;
    public static final int RENT = 2;

    private int state;

    public void setState(int state){
        this.state = state;
    }

    public void  inShop(){
        if(IN_SHOP == state){
            // nothing
        }else if(REPAIRING == state){
            System.out.println("维修...");
            this.inShop(); // 修完还店
            this.setState(IN_SHOP);
        }else if(RENT == state){
            System.out.println("出租...");
            this.inShop(); // 租完还店
            this.setState(IN_SHOP);
        }
    }
    public void repairing(){
        if(IN_SHOP == state){
            System.out.println("在店...");
            this.repairing(); // 可以出租
            this.setState(REPAIRING);
        }else if(REPAIRING == state){
            // nothing
        }else if(RENT == state){
            System.out.println("出租...");
            System.out.println("不能维修...");
        }
    }
    public void rent(){
        if(IN_SHOP == state){
            System.out.println("在店...");
            this.rent(); // 可以出租
            this.setState(RENT);
        }else if(REPAIRING == state){
            System.out.println("维修...");
            System.out.println("不能出租...");
        }else if(RENT == state){
            // nothing
        }
    }


}
