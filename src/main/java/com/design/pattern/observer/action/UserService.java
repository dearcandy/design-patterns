package com.design.pattern.observer.action;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 用户服务
 *
 * @author liuhangfei
 * @date 2023/03/20 10:17
 **/
@Slf4j
@Service
public class UserService {
    /**
     * 用户注册
     * @param telephone 手机号
     * @param password 密码
     * @return java.lang.Long userId
     */
    public Long register(String telephone, String password) {
        // 模拟ID生成
        log.info("模拟ID生成");
        return new Random().nextLong();
    }
}
