package com.design.pattern.proxy.dymic;

import com.design.action.metrics.v2.MetricsCollector;
import com.design.action.metrics.v2.RequestInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 指标采集代理
 *
 * @author liuhangfei
 * @date 2023/03/22 15:48
 **/
public class MetricsCollectorProxy {

    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {

    }

    public MetricsCollectorProxy(MetricsCollector metricsCollector){
        this.metricsCollector = metricsCollector;
    }

    /**
     * 创建代理对象
     * @param proxiedObject 被代理对象即原始对象
     * @return java.lang.Object 代理对象
     */
    public Object createProxyObject(Object proxiedObject){
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, dynamicProxyHandler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject){
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTimestamp = System.currentTimeMillis();
            Object result = method.invoke(proxy, args);
            long endTimestamp = System.currentTimeMillis();
            long responseTime = endTimestamp - startTimestamp;
            String apiName = result.getClass().getName() + ":" + method.getName();
            RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTimestamp);
            metricsCollector.recordRequest(requestInfo);
            return result;
        }
    }
}
