package com.xtl.algorithm.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author xtl
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @date 2022/5/6 10:01
 */
public class BubbleSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(BubbleSort.class.getName());
        int[] arr=new int[]{520,26,15,42,6,84};
        logger.info("排序前的数组是;"+ Arrays.toString(arr));
        bubbleSort(arr);
        logger.info("排序后的数组是;"+ Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
