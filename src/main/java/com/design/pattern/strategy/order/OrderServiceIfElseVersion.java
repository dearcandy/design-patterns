package com.design.pattern.strategy.order;

/**
 * 订单打折服务if-else版本
 *
 * @author liuhangfei
 * @date 2023/03/20 15:11
 **/
public class OrderServiceIfElseVersion {

    public double discount(Order order){
        double discount = 0.0;
        OrderTypeEnum type = order.getType();
        if (type.equals(OrderTypeEnum.NORMAL)){
            System.out.println("普通订单优惠");
            discount = 0.9;
        }else if(type.equals(OrderTypeEnum.GROUPON)){
            System.out.println("团购订单优惠");
            discount = 0.8;
        }else if (type.equals(OrderTypeEnum.PROMOTION)) {
            System.out.println("促销订单优惠");
            discount = 0.6;
        }

        return discount;
    }


}

enum OrderTypeEnum{
    NORMAL("1", "normal"),
    GROUPON("2", "groupon"),
    PROMOTION("3", "promotion");

    private String code;
    private String type;
    OrderTypeEnum(String code, String type) {
        this.code = code;
        this.type = type;
    }


    public String code() {
        return this.code;
    }


    public String type() {
        return this.type;
    }
}