package com.design.pattern.strategy.order;

import java.util.HashMap;
import java.util.Map;

/**
 * 折扣策略工厂
 *
 * @author liuhangfei
 * @date 2023/03/20 15:31
 **/
public class DisCountStrategyFactory {

    private static final Map<OrderTypeEnum, DisCountStrategy> strategies = new HashMap<OrderTypeEnum, DisCountStrategy>();

    static {
        strategies.put(OrderTypeEnum.NORMAL, new NormalDisCountStrategy());
        strategies.put(OrderTypeEnum.GROUPON, new GrouponDisCountStrategy());
        strategies.put(OrderTypeEnum.PROMOTION, new PromotionDisCountStrategy());
    }

    /**
     * 根据订单类型返回折扣策略
     * @param orderType 订单类型
     * @return DisCountStrategy 折扣策略
     */
    public static DisCountStrategy getDisCountStrategy(OrderTypeEnum orderType){
        if (orderType == null){
            throw new IllegalArgumentException("orderType can't be null !");
        }
        return strategies.get(orderType);
    }
}
