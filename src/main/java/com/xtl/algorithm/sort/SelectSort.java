package com.xtl.algorithm.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author 31925
 */
public class SelectSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SelectSort.class.getName());
        int[] arr=new int[]{520,85,36,41,15,42,6,84};
        logger.info("排序前的数组是;"+ Arrays.toString(arr));
        int[] sortedArr = selectSort(arr);
        logger.info("排序后的数组是;"+ Arrays.toString(sortedArr));
    }

    public static int[] selectSort(int[] array) {
        System.out.println("选择排序开始----------");
        for (int i = 0; i < array.length; i++) {
            //每个值只需与他后面的值进行比较，所以从开始
            for (int j = i; j < array.length; j++) {
                //注意此处是哪两个值比较
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
