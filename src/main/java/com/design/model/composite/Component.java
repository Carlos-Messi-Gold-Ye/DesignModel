package com.design.model.composite;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-31 16:59:00
 **/
public class Component {

    private String name;
    private String dept;
    private int salary;
    private Component parent;

    public Component(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String operation(){
        return "名称：" + name + "\t职位："+dept+"\t薪资："+salary;
    }

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }
}
