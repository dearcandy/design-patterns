package com.design.pattern.strategy.order;

/**
 * 正常订单折扣策略
 *
 * @author liuhangfei
 * @date 2023/03/20 15:36
 **/
public class NormalDisCountStrategy implements DisCountStrategy{
    /**
     * 折扣方法
     *
     * @param order 订单
     * @return double 折扣
     */
    public double callDisCount(Order order) {
        return 0.9;
    }
}
