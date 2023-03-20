package com.design.pattern.strategy.order;

/**
 * 订单服务
 *
 * @author liuhangfei
 * @date 2023/03/20 15:28
 **/
public class OrderService {

    public static double disCount(Order order){
        OrderTypeEnum type = order.getType();
        DisCountStrategy disCountStrategy = DisCountStrategyFactory.getDisCountStrategy(type);
        return disCountStrategy.callDisCount(order);
    }
}
