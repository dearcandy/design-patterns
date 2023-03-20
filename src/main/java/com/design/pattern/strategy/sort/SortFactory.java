package com.design.pattern.strategy.sort;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 排序策略工厂
 *
 * @author liuhangfei
 * @date 2023/03/20 16:31
 **/
public class SortFactory {

    private static final Map<String, ISort> iSorts = new HashMap<String, ISort>();

    static {
        iSorts.put("quickSort", new QuickSort());
        iSorts.put("externalSort", new ExternalSort());
        iSorts.put("concurrentExternalSort", new ConcurrentExternalSort());
        iSorts.put("mapReduceSort", new MapReduceSort());
    }

    public static ISort getSortAlg(String type){
        if (type == null || StringUtils.isEmpty(type)){
            throw new IllegalArgumentException("sortType is not be null or empty !");
        }

        return iSorts.get(type);
    }
}
