package com.design.action.metrics.v2;

import org.springframework.util.StringUtils;

/**
 * 指标采集器
 *
 * @author liuhangfei
 * @date 2023/03/22 11:26
 **/
public class MetricsCollector {

    private final MetricsStorage metricsStorage;

    public MetricsCollector(MetricsStorage metricsStorage){
        this.metricsStorage = metricsStorage;
    }

    public void recordRequest(RequestInfo requestInfo){
        if (requestInfo == null && StringUtils.isEmpty(requestInfo.getApiName())){
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}
