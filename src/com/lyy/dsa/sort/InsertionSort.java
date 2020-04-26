package com.lyy.dsa.sort;

/**
 * 插入排序时间复杂度：
 * 1、最好情况是：从尾到头遍历已经有序的数据。
 */
public class InsertionSort {

    public void insertionSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; i++) {
            int value = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (value < arr[j]) {
                    //移动数据
                    arr[j + 1] = arr[j];
                    arr[j] = value;
                } else {
                    break;
                }
            }
        }
    }
}