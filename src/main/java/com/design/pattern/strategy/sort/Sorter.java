package com.design.pattern.strategy.sort;

import java.io.File;

/**
 * 文件排序功能
 *
 * @author liuhangfei
 * @date 2023/03/20 15:58
 **/
public class Sorter {

    private static final Long GB = 1024 * 1024 * 1024L;

    /**
     * 对文件排序
     * @param filePath 文件路径
     */
    public void sortFile(String filePath){
        File file = new File(filePath);
        Long fileSize = file.length();
        if (fileSize < 6 * GB){
            //
            quickSort(file);
        } else if (fileSize < 10 * GB) {
            externalSort(file);
        } else if (fileSize < 100 * GB) {
            concurrentExternalSort(file);
        }else{
            mapReduce(file);
        }
    }

    private void mapReduce(File file) {
    }

    private void concurrentExternalSort(File file) {
    }

    private void externalSort(File file) {
    }

    private void quickSort(File file) {
    }
}
