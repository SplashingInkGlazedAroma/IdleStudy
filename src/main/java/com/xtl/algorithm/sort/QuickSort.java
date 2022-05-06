package com.xtl.algorithm.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author xtl
 * @ClassName QuickSort
 * @Description 快速排序
 * @date 2022/5/6 10:19
 */
public class QuickSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(QuickSort.class.getName());
        int[] arr=new int[]{520,26,15,42,6,84};
        logger.info("排序前的数组是;"+ Arrays.toString(arr));
        int[] sortedArr = quickSort(arr, 0, arr.length - 1);
        logger.info("排序后的数组是;"+ Arrays.toString(sortedArr));
    }

    /**
     * 快速排序
     *
     * @param arr   需要排序的数组
     * @param start 数组的最小索引： 0
     * @param end   数组的最大索引： arr.length - 1
     * @return 排序好的数组
     */
    public static int[] quickSort(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i - 1 > start) {
            arr = quickSort(arr, start, i - 1);
        }
        if (j + 1 < end) {
            arr = quickSort(arr, j + 1, end);
        }
        return (arr);
    }


}
