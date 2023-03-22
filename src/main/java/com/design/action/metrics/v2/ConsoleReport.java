package com.design.action.metrics.v2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 命令行数据上报
 *
 * @author liuhangfei
 * @date 2023/03/22 14:04
 **/
public class ConsoleReport {

    private MetricsStorage metricsStorage;
    private ScheduledExecutorService executorService;

    public ConsoleReport(MetricsStorage metricsStorage, ScheduledExecutorService executorService){
        this.metricsStorage = metricsStorage;
        this.executorService = executorService;
    }

    public void startRepeatReport(Long periodInSeconds, Long durationInSeconds){
        executorService.scheduleAtFixedRate(() -> {

            // 根据指定区间 从数据源获取指标数据
            long durationInMills = durationInSeconds * 1000;
            long endTimeInMills   = System.currentTimeMillis();
            long startTimeInMills = endTimeInMills - durationInMills;
            Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMills, endTimeInMills);
            Map<String, RequestStat> stats = new HashMap<>();
            for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
                String apiName = entry.getKey();
                List<RequestInfo> requestInfosPreApi = entry.getValue();
                // 根据原始数据  统计计算获取到的指标数据
                RequestStat requestStat = Aggregator.aggregate(requestInfosPreApi, durationInMills);
                stats.put(apiName, requestStat);
            }

            // 上报数据到命令行
            System.out.println();

        }, 0, periodInSeconds, TimeUnit.SECONDS);

    }
}
