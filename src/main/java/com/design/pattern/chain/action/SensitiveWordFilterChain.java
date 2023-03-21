package com.design.pattern.chain.action;

import java.util.ArrayList;
import java.util.List;

/**
 * 敏感词过滤链
 *
 * @author liuhangfei
 * @date 2023/03/21 16:35
 **/
public class SensitiveWordFilterChain {

    private List<SensitiveWordFilter> filters = new ArrayList<SensitiveWordFilter>();

    public void addFilter(SensitiveWordFilter filter){
        this.filters.add(filter);
    }

    public boolean filter(Content content){
        for (SensitiveWordFilter filter : filters) {
            // 内容不合法就处理到合法为止或链路结束为止
            if (!filter.doFilter(content)){
               return false;
            }
        }
        return true;
    }
}
