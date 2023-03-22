package com.design.pattern.proxy.statics;

import com.design.action.metrics.v1.UserVo;

/**
 * 抽象用户服务
 *
 * @author liuhangfei
 * @date 2023/03/22 14:21
 **/
public interface IUserController {

    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);
}
