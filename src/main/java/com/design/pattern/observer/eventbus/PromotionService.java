package com.design.pattern.observer.eventbus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 推广服务
 *
 * @author liuhangfei
 * @date 2023/03/20 10:40
 **/
@Slf4j
@Service
public class PromotionService {
    public void issueNewUserExperienceCash(Long userId) {
        log.info("为新用户: {} 发放体验券！", userId);
    }
}
