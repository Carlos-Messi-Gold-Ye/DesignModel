package com.design.model.observer;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-18 17:55:06
 **/
public class App {
    public static void main(String[] args) {
        Father father = new Father();
        Mother mother = new Mother();
        Children children = new Children();
        children.addObserver(father);
        children.addObserver(mother);
        children.setWake(true);
        System.out.println("爸爸，妈妈补觉...");
        children.notifyObservers();
        children.setWake(false);
        System.out.println("孩子又睡了，爸爸，妈妈继续补觉...");
        children.deleteObserver(father);
        System.out.println("爸爸，有事出门了...");
        children.setWake(true);
        children.notifyObservers();
    }
}
