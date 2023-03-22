package com.design.pattern.proxy.dymic;

import com.design.pattern.proxy.statics.IUserController;
import com.design.pattern.proxy.statics.UserController;

/**
 * 测试类
 *
 * @author liuhangfei
 * @date 2023/03/22 16:02
 **/
public class Demo {
    public static void main(String[] args) {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxyObject(new UserController());
    }
}
