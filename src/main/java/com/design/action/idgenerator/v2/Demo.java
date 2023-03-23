package com.design.action.idgenerator.v2;

/**
 * 测试类
 *
 * @author liuhangfei
 * @date 2023/03/23 09:51
 **/
public class Demo {

    public static void main(String[] args) {
        LogTraceIdGenerator logTraceIdGenerator = new RandomIdGenerator();
        String generator = logTraceIdGenerator.generator();
        System.out.println(generator);
    }
}
