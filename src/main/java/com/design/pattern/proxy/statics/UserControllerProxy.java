package com.design.pattern.proxy.statics;

import com.design.action.metrics.v1.UserVo;
import com.design.action.metrics.v2.MetricsCollector;
import com.design.action.metrics.v2.RedisMetricsStorage;
import com.design.action.metrics.v2.RequestInfo;

/**
 * 用户服务代理类
 *
 * @author liuhangfei
 * @date 2023/03/22 14:24
 **/
public class UserControllerProxy implements IUserController{

    private final MetricsCollector metricsCollector;
    private final UserController userController;

    public UserControllerProxy(UserController userController){
        this.metricsCollector = new MetricsCollector(new RedisMetricsStorage());
        this.userController = userController;
    }

    @Override
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 原本业务 委托
        UserVo userVo = userController.login(telephone, password);

        long endTimestamp = System.currentTimeMillis();
        long responseTime = endTimestamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 原本业务 委托
        UserVo userVo = userController.register(telephone, password);

        long endTimestamp = System.currentTimeMillis();
        long responseTime = endTimestamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);


        return userVo;
    }
}
