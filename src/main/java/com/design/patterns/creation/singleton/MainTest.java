package com.design.patterns.creation.singleton;

import java.util.Map;
import java.util.Properties;

/**
 * @ClassName MainTest
 * @Description 测试方法
 * @Author DearCandy
 * @Date 2021/12/15 19:03
 * @Version 1.0.0
 **/
public class MainTest {
    public static void main(String[] args) {
        // 获取系统配置信息
        Properties properties = System.getProperties();
        System.out.println(properties);
        // 获取系统环境信息
        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);

    }
}
