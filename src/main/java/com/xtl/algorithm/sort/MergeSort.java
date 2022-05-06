package com.xtl.algorithm.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author xtl
 * @ClassName MergeSort
 * @Description 归并排序
 * @date 2022/5/6 10:46
 */
public class MergeSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MergeSort.class.getName());
        int[] arr=new int[]{520,26,15,42,6,84};
        logger.info("排序前的数组是;"+ Arrays.toString(arr));
        int[] sortedArr = mergeSort(arr, 0, arr.length - 1);
        logger.info("排序后的数组是;"+ Arrays.toString(sortedArr));
    }

    /**
     * 归并排序
     * @param nums 待排序数组
     * @param l 开始索引：0
     * @param h 最大索引：nums.length - 1
     * @return 排序好的数组
     */
    public static int[] mergeSort(int[] nums, int l, int h) {
        if (l == h) {
            return new int[]{nums[l]};
        }

        int mid = l + (h - l) / 2;
        //左有序数组
        int[] leftArr = mergeSort(nums, l, mid);
        //右有序数组
        int[] rightArr = mergeSort(nums, mid + 1, h);
        //新有序数组
        int[] newNum = new int[leftArr.length + rightArr.length];

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] <= rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length) {
            newNum[m++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            newNum[m++] = rightArr[j++];
        }
        return newNum;
    }

}
