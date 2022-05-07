package com.xtl.algorithm.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @ClassName CountSort
 * @Description 计数排序
 * @author 31925
 * @date 2022/5/7 9:09
 */
public class CountSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(CountSort.class.getName());
        int[] arr=new int[]{520,85,36,41,15,42,6,84};
        logger.info("排序前的数组是;"+ Arrays.toString(arr));
        countSort(arr);
        logger.info("排序后的数组是;"+ Arrays.toString(arr));
    }

    public static void countSort(int[] array) {
        System.out.println("计数排序开始--------");
        //计算最大值和最小值，用于确定count[]的长度
        int max = array[0], min = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        //count[]用于存储每个元素出现的次数
        int[] count = new int[max - min + 1];

        //统计出现的频次
        for (int i : array) {
            //数的位置 上+1
            count[i - min] += 1;
        }

        //创建最终返回的数组，和原始数组长度相等，但是排序完成的
        int[] result = new int[array.length];
        //记录最终数组的下标
        int index = 0;

        //先循环每一个元素  在计数排序器的下标中
        for (int i = 0; i < count.length; i++) {
            //遍历循环出现的次数
            //count[i]:这个数出现的频率
            for (int j = 0; j < count[i]; j++) {
                //以为原来减少了min现在加上min，值就变成了原来的值
                result[index++] = i + min;
            }
            System.out.println(Arrays.toString(result));
        }
    }

}

