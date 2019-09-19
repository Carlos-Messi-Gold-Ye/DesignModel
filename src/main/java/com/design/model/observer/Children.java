package com.design.model.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-18 17:12:19
 **/
public class Children implements IObserverable {

    private List<IObserver> observers = new ArrayList<>();
    private boolean isWake = false;

    public void setWake(boolean wake) {
        isWake = wake;
    }

    @Override
    public void addObserver(IObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(isWake){
            System.out.println("孩子醒了...哇哇大哭...");
            for (IObserver observer : observers) {
                observer.update("孩子醒了");
            }
        }
    }
}
