package com.design.pattern.strategy.demo;

/**
 * 具体策略实现类1
 *
 * @author liuhangfei
 * @date 2023/03/20 14:50
 **/
public class ConcreteStrategyA implements Strategy{
    /**
     * 具体算法实现
     */
    public void algorithmInterface() {
        System.out.println("类A具体算法实现");
    }
}
