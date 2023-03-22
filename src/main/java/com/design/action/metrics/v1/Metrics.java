package com.design.action.metrics.v1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 指标统计
 *
 * @author liuhangfei
 * @date 2023/03/22 10:49
 **/
public class Metrics {

    private Map<String, List<Double>> responseTimes = new HashMap<>();
    private Map<String, List<Double>> timestamps = new HashMap<>();
    /**
     * 核心线程数为4的定时任务线程池
     */
    private ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(4);

    public void recordResponseTime(String apiName, Double responseTime){
        responseTimes.putIfAbsent(apiName, new ArrayList<>());
        responseTimes.get(apiName).add(responseTime);
    }

    public void recordTimestamps(String apiName, Double timestamp){
        responseTimes.putIfAbsent(apiName, new ArrayList<>());
        responseTimes.get(apiName).add(timestamp);
    }

    // 开启定时报告
    public void startRepeatedReport(long period, TimeUnit unit){
        executorService.scheduleAtFixedRate(() -> {
            Map<String, Map<String, Double>> stats = new HashMap<>();
            for (Map.Entry<String, List<Double>> entry : responseTimes.entrySet()) {
                String apiName = entry.getKey();
                List<Double> apiRespTimes = entry.getValue();
                stats.putIfAbsent(apiName, new HashMap<>());
                stats.get(apiName).put("max", max(apiRespTimes));
                stats.get(apiName).put("avg", avg(apiRespTimes));
            }

            for (Map.Entry<String, List<Double>> entry : timestamps.entrySet()) {
                String apiName = entry.getKey();
                List<Double> apiTimeStamps = entry.getValue();
                stats.putIfAbsent(apiName, new HashMap<>());
                stats.get(apiName).put("count", (double) apiTimeStamps.size());
            }

        }, 0, period, unit);

    }

    private double max(List<Double> dataset) {
        return 0;
    }

    private double avg(List<Double> dataset) {
        return 0;
    }
}
