package com.design.pattern.observer.demo;

/**
 * 抽象主题
 * @author liuhangfei
 * @date 2023/03/17 18:06
 **/
public interface Subject {
    /**
     * 订阅
     * @param observer 观察者对象
     */
    void registerObserver(Observer observer);
    /**
     * 取消订阅
     * @param observer 观察者对象
     */
    void removeObserver(Observer observer);
    /**
     * 发布通知
     * @param message 消息实体
     */
    void notifyObservers(Message message);
}
