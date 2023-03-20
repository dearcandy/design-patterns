package com.design.pattern.strategy.order;

/**
 * 打折策略接口
 *
 * @author liuhangfei
 * @date 2023/03/20 15:29
 **/
public interface DisCountStrategy {

    /**
     * 抽象折扣方法
     * @param order 订单
     * @return double 折扣
     */
    double callDisCount(Order order);
}
