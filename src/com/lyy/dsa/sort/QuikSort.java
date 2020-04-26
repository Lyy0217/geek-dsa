package com.lyy.dsa.sort;

/**
 * 快速排序
 */
public class QuikSort {

    public void quikSort(int[] arr, int n) {
        quikSort(arr, 0, n - 1);
    }

    private void quikSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int pivotIndex = partition(arr, startIndex, endIndex);

        quikSort(arr, startIndex, pivotIndex - 1);
        quikSort(arr, pivotIndex + 1, endIndex);

    }

    /**
     * 类似于选择排序的思想：processIndex-1之前的数据是处理过的数据，每次从后面的数据选择一个 < pivotValue的数据放到
     * 前面处理过的数据中。
     *
     * @param arr
     * @param startIndex
     * @param endIndex
     * @return
     */
    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivotValue = arr[endIndex];

        int processIndex = startIndex;
        for (int i = startIndex; i <= endIndex - 1; ++i) {
            if (arr[i] < pivotValue) {
                swap(arr, i, processIndex);
                processIndex++;
            }
        }

        swap(arr, processIndex, endIndex);

        return processIndex;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];

        arr[i] = arr[j];
        arr[j] = tmp;
    }
}