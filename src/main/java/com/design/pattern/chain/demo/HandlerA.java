package com.design.pattern.chain.demo;

/**
 * 具体处理器A
 *
 * @author liuhangfei
 * @date 2023/03/21 16:06
 **/
public class HandlerA implements IHandler{

    public boolean doHandler() {
        boolean handled = false;
        // A定制逻辑
        System.out.println("A处理了");

        return handled;
    }
}
