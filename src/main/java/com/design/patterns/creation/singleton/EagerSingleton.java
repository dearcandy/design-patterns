package com.design.patterns.creation.singleton;

/**
 * @ClassName EagerSingleton
 * @Description 饿汉式单例模式
 * @Author DearCandy
 * @Date 2021/7/15 10:32
 * @Version 1.0.0
 **/
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
