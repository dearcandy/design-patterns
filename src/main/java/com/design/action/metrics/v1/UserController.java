package com.design.action.metrics.v1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 用户服务控制器
 *
 * @author liuhangfei
 * @date 2023/03/22 10:46
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private final Metrics metrics = new Metrics();

    public UserController(){
        metrics.startRepeatedReport(60, TimeUnit.SECONDS);
    }



    @PostMapping("/register")
    public void register(UserVo userVo){
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamps("register", (double) startTimestamp);
        // 注册实现

        long respTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("register", (double) respTime);
    }

    @PostMapping("/login")
    public UserVo login(String telephone, String password){
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamps("login", (double) startTimestamp);
        // 登录实现

        long respTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("login", (double) respTime);
        return new UserVo();
    }
}
