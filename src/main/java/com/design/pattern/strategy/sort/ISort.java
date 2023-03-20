package com.design.pattern.strategy.sort;

/**
 * 排序接口
 *
 * @author liuhangfei
 * @date 2023/03/20 16:06
 **/
public interface ISort {

    /**
     * 抽象排序方法
     * @param filePath 文件路径
     */
    void sort(String filePath);

}
