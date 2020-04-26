package com.lyy.dsa.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public void mergeSort(int[] arr, int n) {
        mergeSort(arr, 0, n - 1);
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (end == start) {
            return;
        }

        //分解
        mergeSort(arr, start, (end - start) / 2);
        mergeSort(arr, (end - start) / 2 + 1, end);

        //归并
        mergeSort(arr, start, (end - start) / 2, (end - start) / 2 + 1, end);
    }

    private void mergeSort(int[] arr, int start, int mid, int mid2, int end) {
        int[] tmp = new int[end - start + 1];

        //归并
        int i = start;
        int j = mid2;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        if (i <= mid) {
            while (i <= mid) {
                tmp[k++] = arr[i++];
            }
        }

        if (j <= end) {
            while (j <= end) {
                tmp[k++] = arr[j++];
            }
        }

        arr = Arrays.copyOfRange(tmp, start, end);
    }
}