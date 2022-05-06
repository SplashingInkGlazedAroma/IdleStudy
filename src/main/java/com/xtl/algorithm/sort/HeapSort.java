package com.xtl.algorithm.sort;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author 31925
 */
public class HeapSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HeapSort.class.getName());
        int[] arr=new int[]{520,26,15,42,6,51,23,80};
        logger.info("排序前的数组是;"+ Arrays.toString(arr));
        sort(arr);
        logger.info("排序后的数组是;"+ Arrays.toString(arr));
    }

    public static void sort(int[] array) {
        //创建堆
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(array, i, array.length);
        }

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = array.length - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            //重新对堆进行调整
            adjustHeap(array, 0, i);
        }
    }

    /**
     * 调整堆
     * @param array 待排序列
     * @param parent 父节点
     * @param length 待排序列尾元素索引
     */
    private static void adjustHeap(int[] array, int parent, int length) {
        //将temp作为父节点
        int temp = array[parent];
        //左孩子
        int lChild = 2 * parent + 1;
        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && array[lChild] < array[rChild]) {
                lChild++;
            }
            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= array[lChild]) {
                break;
            }
            // 把孩子结点的值赋给父结点
            array[parent] = array[lChild];
            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        array[parent] = temp;
        System.out.println(Arrays.toString(array));
    }
}


