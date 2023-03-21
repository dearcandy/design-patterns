package com.design.pattern.chain.action;

/**
 * 政治敏感词过滤器
 *
 * @author liuhangfei
 * @date 2023/03/21 16:28
 **/
public class PoliticalWordFilter implements SensitiveWordFilter{

    public boolean doFilter(Content content) {
        boolean legal = true;

        // 过滤逻辑

        return legal;
    }
}
