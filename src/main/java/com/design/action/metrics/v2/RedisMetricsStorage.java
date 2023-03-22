package com.design.action.metrics.v2;

import java.util.List;
import java.util.Map;

/**
 * 指标存储Redis实现
 *
 * @author liuhangfei
 * @date 2023/03/22 13:49
 **/
public class RedisMetricsStorage implements MetricsStorage{
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        // default implement
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMills, long endTimeInMills) {
        // default implement

        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMills, long endTimeInMills) {
        // default implement

        return null;
    }
}
