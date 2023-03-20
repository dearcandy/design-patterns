package com.design.pattern.observer.demo;

/**
 * 具体观察者之一
 * @author liuhangfei
 * @date 2023/03/17 18:15
 **/
public class ConcreteObserverTwo implements Observer{

    /**
     * 获取消息
     * @param message 消息实体
     */
    public void update(Message message) {
        String content = message.getContent();
        System.out.println("ConcreteObserverTwo getMessage ： " + content);
    }
}
