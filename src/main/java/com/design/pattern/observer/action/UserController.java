package com.design.pattern.observer.action;

import com.google.common.eventbus.EventBus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 用户服务
 *
 * @author liuhangfei
 * @date 2023/03/20 10:15
 **/
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    private  EventBus eventBus;
    @Resource
    RegisterNotificationObserver notificationObserver;
    @Resource
    RegisterPromotionObserver promotionObserver;

    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    @PostConstruct
    public void initEventBus(){
        log.info("eventBus 开始注册观察者");
        eventBus = new EventBus();
        eventBus.register(promotionObserver);
        eventBus.register(notificationObserver);
    }

    @GetMapping("/register")
    public Long register(@RequestParam("tle") String telephone, @RequestParam("pas") String password){
        long userId = userService.register(telephone, password);
        // 向所有注册订阅者发布用户 userId 注册成功事件
        log.info("eventBus 向所有注册订阅者发布用户 {} 注册成功事件", userId);
        eventBus.post(userId);
        return userId;
    }



}
