package com.design.pattern.template;

/**
 * 抽象模板类
 *
 * @author liuhangfei
 * @date 2023/03/20 14:04
 **/
public abstract class AbstractClass {

    public final void templateMethod(){
        method1();
        method2();
    }

    protected abstract void method1();

    protected abstract void method2();


}
