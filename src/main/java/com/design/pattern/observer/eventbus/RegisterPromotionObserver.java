package com.design.pattern.observer.eventbus;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 注册增强观察者
 *
 * @author liuhangfei
 * @date 2023/03/20 10:30
 **/
@Service
public class RegisterPromotionObserver {

    @Resource
    private PromotionService promotionService;


    @Subscribe
    public void handleRegSuccess(Long userId){
        // 为新用户发放优惠券
        promotionService.issueNewUserExperienceCash(userId);
    }
}
