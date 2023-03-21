package com.design.pattern.chain.demo;

/**
 * 测试类
 *
 * @author liuhangfei
 * @date 2023/03/21 16:13
 **/
public class Application {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());

        handlerChain.handler();
    }
}
