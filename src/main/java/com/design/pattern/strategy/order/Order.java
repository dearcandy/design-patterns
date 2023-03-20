package com.design.pattern.strategy.order;

public class Order{
    private OrderTypeEnum type;

    public OrderTypeEnum getType(){
        return this.type;
    }

    public void setType(OrderTypeEnum orderTypeEnum){
        this.type = orderTypeEnum;
    }
}
