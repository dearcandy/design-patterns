package com.design.pattern.observer.demo;

/**
 * 测试类
 * @author liuhangfei
 * @date 2023/03/17 18:19
 **/
public class Demo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserverOne observerOne = new ConcreteObserverOne();

        ConcreteObserverTwo observerTwo = new ConcreteObserverTwo();

        subject.registerObserver(observerOne);
        subject.registerObserver(observerTwo);

        subject.notifyObservers(new Message("content"));
    }
}
