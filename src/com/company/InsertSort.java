package com.company;

import java.util.Arrays;

public class InsertSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int temp = arr[i];
            while (index > 0 && arr[index - 1] >= temp) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
