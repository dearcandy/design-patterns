package com.design.pattern.chain.action;

/**
 * 敏感词过滤器
 *
 * @author liuhangfei
 * @date 2023/03/21 16:28
 **/
public interface SensitiveWordFilter {

    boolean doFilter(Content content);
}
