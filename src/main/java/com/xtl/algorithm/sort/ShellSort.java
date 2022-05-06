package com.xtl.algorithm.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author xtl
 * @ClassName ShellSort
 * @Description 希尔排序
 * @date 2022/5/6 10:41
 */
public class ShellSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ShellSort.class.getName());
        int[] arr=new int[]{520,26,15,42,6,51,23,80};
        logger.info("排序前的数组是;"+ Arrays.toString(arr));
        shellSort(arr);
        logger.info("排序后的数组是;"+ Arrays.toString(arr));
    }

    /**
     * 希尔排序
     * @param a 待排序数组
     */
    private static void shellSort(int[] a) {
        int dk = a.length / 2;
        while (dk >= 1) {
            //类似插入排序，只是插入排序增量是 1，这里增量是 dk,把 1 换成 dk 就可以了
            for (int i = dk; i < a.length; i++) {
                if (a[i] < a[i - dk]) {
                    int j;
                    //x 为待插入元素
                    int x = a[i];
                    a[i] = a[i - dk];
                    for (j = i - dk; j >= 0 && x < a[j]; j = j - dk) {
                        //通过循环，逐个后移一位找到要插入的位置。
                        a[j + dk] = a[j];
                    }
                    //插入
                    a[j + dk] = x;
                }
            }
            dk = dk / 2;
        }
    }

}
