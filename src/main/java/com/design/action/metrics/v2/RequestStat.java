package com.design.action.metrics.v2;

import lombok.Data;

/**
 * 请求状态实体
 *
 * @author liuhangfei
 * @date 2023/03/22 13:53
 **/
@Data
public class RequestStat {

    private Double maxResponseTime;
    private Double avgResponseTime;
    private Double minResponseTime;
    private Double p99ResponseTime;
    private Double p999ResponseTime;
    private Long count;
    private Long tps;
}
