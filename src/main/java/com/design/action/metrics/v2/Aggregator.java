package com.design.action.metrics.v2;

import java.util.List;

/**
 * 聚合统计
 *
 * @author liuhangfei
 * @date 2023/03/22 13:51
 **/
public class Aggregator {

    public static RequestStat aggregate(List<RequestInfo> requestInfos, Long durationInMills){
        Double maxResponseTime = Double.MIN_VALUE;
        Double avgResponseTime = Double.NaN;
        Double minResponseTime = Double.MAX_VALUE;
        Double p99ResponseTime = Double.NaN;
        Double p999ResponseTime = Double.NaN;
        Long count = -1L;
        Long tps = -1L;


        return new RequestStat();
    }
}
