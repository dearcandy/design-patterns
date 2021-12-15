package com.design.patterns.creation.singleton;

/**
 * @ClassName Singleton
 * @Description 静态内部类单例模式
 * @Author DearCandy
 * @Date 2021/7/15 10:58
 * @Version 1.0.0
 **/
public class Singleton {

    private Singleton(){}

    private static class HolderClass{
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.instance;
    }


}
