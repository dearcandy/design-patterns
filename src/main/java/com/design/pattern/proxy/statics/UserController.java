package com.design.pattern.proxy.statics;

import com.design.action.metrics.v1.UserVo;

/**
 * 具体用户服务
 *
 * @author liuhangfei
 * @date 2023/03/22 14:23
 **/
public class UserController implements IUserController{
    @Override
    public UserVo login(String telephone, String password) {
        return null;
    }

    @Override
    public UserVo register(String telephone, String password) {
        return null;
    }
}
