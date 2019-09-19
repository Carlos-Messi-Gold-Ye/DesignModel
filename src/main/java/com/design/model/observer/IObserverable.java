package com.design.model.observer;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-18 17:45:53
 **/
public interface IObserverable {

    void addObserver(IObserver observer);

    void deleteObserver(IObserver observer);

    void notifyObservers();
}
