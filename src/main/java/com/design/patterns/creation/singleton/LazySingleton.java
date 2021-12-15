package com.design.patterns.creation.singleton;

/**
 * @ClassName LazySingleton
 * @Description 懒汉式单例模式
 * @Author DearCandy
 * @Date 2021/7/15 10:36
 * @Version 1.0.0
 **/
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton(){}

    /*
    * @Author DearCandy
    * @Description 解决了线程安全问题，但是每次调用getInstance() 方法需要进行线程锁定判断，高并发情况下会影响性能
    * @Date 10:42 2021/7/15
    * @Param
    * @return
    **/
    synchronized public static LazySingleton getInstance1(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    /*
    *
    * @Author DearCandy
    * @Description 将synchronized修饰方法换为修饰  instance = new LazySingleton();
    *               这句代码，会存在新问题，当线程A进入synchronized锁定的代码中执行完毕后
    *               排队等待的线程B并不能知道实例已经创建成功 会再次创建
    * @Date 10:43 2021/7/15
    * @Param []
    * @return com.base.design.patterns.singleton.LazySingleton
    **/
    public static LazySingleton getInstance2(){
        if (instance == null){
            synchronized (LazySingleton.class){
                instance = new LazySingleton();
            }
        }
        return instance;
    }

    /*
    *
    * @Author DearCandy
    * @Description 双重检查锁定，volatile修饰instance 保障线程之间的可见性
    *               但是volatile会屏蔽虚拟机做的一些优化，导致系统运行效率降低
    * @Date 10:52 2021/7/15
    * @Param []
    * @return com.base.design.patterns.singleton.LazySingleton
    **/
    public static LazySingleton getInstance(){
        // 第一重判断
        if (instance == null){
            // 锁定代码块
            synchronized (LazySingleton.class){
                // 第二重判断
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


}
