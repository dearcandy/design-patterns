package com.design.pattern.observer.eventbus;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 注册通知观察者
 *
 * @author liuhangfei
 * @date 2023/03/20 10:37
 **/
@Service
public class RegisterNotificationObserver {

    @Resource
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(Long userId){
        // 新用户注册成功发送站内通知
        notificationService.sendInBoxMessage(userId);
    }
}
