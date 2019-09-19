package com.design.model.observer;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-18 16:42:56
 **/
public class ObserverCounter {

    static class Children {
        private boolean isWake = false;

        public void setWake(boolean wake) {
            isWake = wake;
        }

        public boolean isWake() {
            return isWake;
        }
    }

    static class Father {
        public void update(String msg) {
            System.out.println(msg + ",爸爸去泡奶粉...");
        }
    }

    static class Mother {
        public void update(String msg) {
            System.out.println(msg + ",妈妈去穿衣服...");
        }
    }

    public static void main(String[] args) {
        Children children = new Children();
        Father father = new Father();
        Mother mother = new Mother();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if(children.isWake()){
                        String msg = "孩子醒了";
                        System.out.println("孩子醒了...哇哇大哭...");
                        father.update(msg);
                        mother.update(msg);
                        break;
                    }else {
                        System.out.println("盯着在睡觉的孩子，等他醒...");
                    }
                }
            }
        }).start();
        try {
            Thread.sleep(10);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

        children.setWake(true);

    }
}
