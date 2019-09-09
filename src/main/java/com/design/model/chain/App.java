package com.design.model.chain;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-09 11:09:02
 **/
public class App {

    public static void main(String[] args) {
        ILeader group = new GroupLeader();
        ILeader director = new DirectorLeader();
        ILeader ceo = new CeoLeader();
        ILeader shareholder = new ShareholderLeader();
        group.setSuperior(director);
        director.setSuperior(ceo);
        ceo.setSuperior(shareholder);

        IEmployee a = new ZucheEmployee(2, "感冒生病.");
        IEmployee b = new ZucheEmployee(5, "出去旅游.");
        IEmployee c = new ZucheEmployee(14, "准备结婚.");
        IEmployee d = new ZucheEmployee(28, "需要手术.");
        System.out.println(group.approval(a));
        System.out.println("-----");
        System.out.println(group.approval(b));
        System.out.println("-----");
        System.out.println(group.approval(c));
        System.out.println("-----");
        System.out.println(group.approval(d));
        System.out.println("-----");
    }
}
