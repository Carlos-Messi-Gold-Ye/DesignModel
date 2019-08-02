package com.design.model.prototype;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-30 15:57:54
 **/
public class Toy implements Cloneable {
    private int size;
    private String name;
    private String drop;

    public Toy(int size, String name) {
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.size = size;
            this.name = name;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    protected Toy prototype() throws CloneNotSupportedException{
        return (Toy) super.clone();
    }
}
