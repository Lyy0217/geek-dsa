package com.lyy.dsa.sort;

/**
 * 冒泡排序时间复杂度
 */
public class BublleSort {

    /**
     * 冒泡排序
     *
     * @param arr
     * @param n
     */
    public void bublleSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSwap = true;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            if (!isSwap) {
                break;
            }
        }


    }
}