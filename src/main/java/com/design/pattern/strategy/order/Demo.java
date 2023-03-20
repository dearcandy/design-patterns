package com.design.pattern.strategy.order;

/**
 * 测试类
 *
 * @author liuhangfei
 * @date 2023/03/20 15:55
 **/
public class Demo {

    public static void main(String[] args) {
        Order order = new Order();
        order.setType(OrderTypeEnum.GROUPON);
        double disCount = OrderService.disCount(order);
        System.out.println("此订单折扣为 ： " + disCount);
    }
}
