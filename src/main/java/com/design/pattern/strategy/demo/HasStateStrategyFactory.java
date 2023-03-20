package com.design.pattern.strategy.demo;

import org.springframework.util.StringUtils;

/**
 * 有状态策略工厂
 *
 * @author liuhangfei
 * @date 2023/03/20 14:52
 **/
public class HasStateStrategyFactory{

    /**
     * 根据类型获取策略
     * @param type 策略类型
     * @return com.design.pattern.strategy.demo.Strategy 具体策略对象
     */
    public static Strategy getStrategy(String type) {
        if (type == null || StringUtils.isEmpty(type)){
            throw new IllegalArgumentException("Strategy type is not exist!");
        }
       if (type.equals("A")){
           return new ConcreteStrategyA();
       }else if (type.equals("B")){
           return new ConcreteStrategyB();
       }

       return null;
    }

}
