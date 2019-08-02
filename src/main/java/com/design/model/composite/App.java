package com.design.model.composite;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-31 17:30:41
 **/
public class App {

    public static void main(String[] args) {
        Composite ceo = new Composite("王董","Ceo",100000);
        Composite headCoder = new Composite("李总","HeadCoder",10000);
        Component coderYe = new Component("小叶","Coder",1000);
        Component codeYi = new Component("小伊","Coder",1000);
        Component clerk = new Component("刘秘","Clerk",9000);
        ceo.addSubComponent(clerk);
        ceo.addSubComponent(headCoder);
        headCoder.addSubComponent(coderYe);
        headCoder.addSubComponent(codeYi);
        display(ceo);
    }

    private static void display(Composite root){
        System.out.println(root.operation());
        for(Component component:root.getComponentList()){
            if(component instanceof Composite){
                display((Composite) component);
            }else {
                System.out.println(component.operation());
            }
        }
    }
}
