package com.design.action.metrics.v2;

import lombok.Data;

/**
 * 请求信息
 *
 * @author liuhangfei
 * @date 2023/03/22 11:29
 **/
@Data
public class RequestInfo {

    private String apiName;
    private Double responseTime;
    private Long timestamp;

    public RequestInfo(String apiName, long responseTime, long timestamp) {
        this.apiName = apiName;
        this.responseTime = (double) responseTime;
        this.timestamp = timestamp;
    }
}
