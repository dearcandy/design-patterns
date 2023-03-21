package com.design.pattern.chain.action;

import org.checkerframework.checker.units.qual.C;

/**
 * 测试类
 *
 * @author liuhangfei
 * @date 2023/03/21 16:42
 **/
public class Application {
    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());
        filterChain.addFilter(new AdsWordFilter());

        filterChain.filter(new Content());
    }
}
