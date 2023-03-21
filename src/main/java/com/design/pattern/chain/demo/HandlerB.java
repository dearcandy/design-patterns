package com.design.pattern.chain.demo;

/**
 * 具体处理器B
 *
 * @author liuhangfei
 * @date 2023/03/21 16:06
 **/
public class HandlerB implements IHandler{

    public boolean doHandler() {
        boolean handled = false;
        // B定制逻辑
        System.out.println("B处理了");

        return handled;
    }
}
