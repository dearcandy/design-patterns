package com.design.pattern.strategy.demo;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 无状态策略工厂
 *
 * @author liuhangfei
 * @date 2023/03/20 15:02
 **/
public class NonStateStrategyFactory {

    private static final Map<String, Strategy> strategies = new HashMap<String, Strategy>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    /**
     * 根据类型获取策略
     * @param type 策略类型
     * @return com.design.pattern.strategy.demo.Strategy 具体策略对象
     */
    public static Strategy getStrategy(String type) {
        if (type == null || StringUtils.isEmpty(type)){
            throw new IllegalArgumentException("Strategy type is not exist!");
        }
        return strategies.get(type);
    }
}

