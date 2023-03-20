package com.design.pattern.observer.demo;

/**
 * 观察者
 * @author liuhangfei
 * @date 2023/03/17 18:05
 **/
public interface Observer {
    /**
     * 获取消息
     * @param message 消息实体
     */
    void update(Message message);
}
