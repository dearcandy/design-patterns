package com.design.pattern.chain.demo;

/**
 * 抽象处理器
 *
 * @author liuhangfei
 * @date 2023/03/20 18:12
 **/
public abstract class Handler {

    /**
     * 后继处理器
     */
    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public final void handler(){
        boolean handled = doHandler();
        if (!handled && successor != null){
            successor.handler();
        }
    }

    protected abstract boolean doHandler();
}
