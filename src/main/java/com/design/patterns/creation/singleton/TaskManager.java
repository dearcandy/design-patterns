package com.design.patterns.creation.singleton;

/**
 * @ClassName TaskManager
 * @Description 任务管理器实例类
 * @Author DearCandy
 * @Date 2021/7/15 9:58
 * @Version 1.0.0
 **/
public class TaskManager {

    private static TaskManager tm = null;

    // 私有构造
    private TaskManager(){}

    // 显示进程
    public void displayProcess(){}

    // 显示服务
    public void displayService(){}

    // 获取实例
    public static TaskManager getInstance(){
        if (tm == null){
            tm = new TaskManager();
        }
        return tm;
    }


}
