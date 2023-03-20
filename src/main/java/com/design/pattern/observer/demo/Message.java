package com.design.pattern.observer.demo;

/**
 * 消息通知
 * @author liuhangfei
 * @date 2023/03/17 18:06
 **/
public class Message {

    // 消息内容
    private String content;

    public Message(String content) {
        this.content = content;
    }


    public String getContent(){
        return this.content;
    }
}
