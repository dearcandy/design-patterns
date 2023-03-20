package com.design.pattern.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 * @author liuhangfei
 * @date 2023/03/17 18:11
 **/
public class ConcreteSubject implements Subject {

    private final List<Observer> observers = new ArrayList<Observer>();
    /**
     * 订阅
     *
     * @param observer 观察者对象
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 取消订阅
     *
     * @param observer 观察者对象
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 发布通知
     *
     * @param message 消息实体
     */
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
