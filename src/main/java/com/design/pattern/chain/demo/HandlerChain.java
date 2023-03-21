package com.design.pattern.chain.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理器链
 *
 * @author liuhangfei
 * @date 2023/03/21 16:10
 **/
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<IHandler>();

    public void addHandler(IHandler handler){
        this.handlers.add(handler);
    }

    public void handler(){
        for (IHandler handler: handlers) {
            boolean handled = handler.doHandler();
            if (handled){
                break;
            }
        }
    }
}
