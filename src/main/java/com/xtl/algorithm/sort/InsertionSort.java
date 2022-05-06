package com.xtl.algorithm.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author xtl
 * @ClassName InsertionSort
 * @Description 插入排序
 * @date 2022/5/6 10:17
 */
public class InsertionSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(InsertionSort.class.getName());
        int[] arr=new int[]{520,26,15,42,6,84};
        logger.info("排序前的数组是;"+ Arrays.toString(arr));
        insertionSort(arr);
        logger.info("排序后的数组是;"+ Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //插入的数
            int insertVal = arr[i];
            //被插入的位置(准备和前一个数比较)
            int index = i - 1;
            //如果插入的数比被插入的数小
            while (index >= 0 && insertVal < arr[index]) {
                //将把 arr[index] 向后移动
                arr[index + 1] = arr[index];
                //让 index 向前移动
                index--;
            }
            //把插入的数放入合适位置
            arr[index + 1] = insertVal;
        }
    }

}
