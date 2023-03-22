package com.design.action.metrics.v2;

import java.util.List;
import java.util.Map;

/**
 * 指标存储接口
 *
 * @author liuhangfei
 * @date 2023/03/22 11:27
 **/
public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMills, long endTimeInMills);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMills, long endTimeInMills);
}
