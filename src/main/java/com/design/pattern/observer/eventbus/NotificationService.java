package com.design.pattern.observer.eventbus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 消息通知服务
 *
 * @author liuhangfei
 * @date 2023/03/20 10:39
 **/
@Slf4j
@Service
public class NotificationService {
    public void sendInBoxMessage(Long userId) {
        log.info("为新用户: {} 发送站内通知！", userId);
    }
}
