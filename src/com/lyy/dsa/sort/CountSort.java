package com.lyy.dsa.sort;

/**
 * 计数排序:
 * 1、主要理解计数的过程
 * 2、也可以在每一个桶里搞一个变量来计数、或者直接使用List会更加简单
 */
public class CountSort {

    public void countSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        //找到数组中元素最大的值
        int max = finMaxValue(arr, n);

        //初始化计数数组
        int[] countArray = initCountArray(max);

        //计算每个元素的个数并放在计数数组中
        calculationCountArray(countArray, max + 1, arr, n);

        //临时数组r[]，存放排序之后的结果
        int[] r = new int[n];

        //计算排序的关键步骤
        for (int i = 0; i < n; i++) {
            int perCntOfkIndex = countArray[arr[i]];
            r[perCntOfkIndex - 1] = arr[i];
            countArray[arr[i]]--;
        }

        //将结果拷贝给数组arr
        System.arraycopy(r, 0, arr, 0, n);
    }

    /**
     * @param countArray     countArray[k]代表小于等于分数k的学生的个数
     * @param countArraySize size
     * @param arr            原始数组
     * @param arrSize        size
     */
    private void calculationCountArray(int[] countArray, int countArraySize, int[] arr, int arrSize) {

    }

    private int finMaxValue(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    private int[] initCountArray(int max) {
        int[] countArr = new int[max + 1];
        for (int i = 0; i < max + 1; i++) {
            countArr[i] = 0;
        }
        return countArr;
    }
}