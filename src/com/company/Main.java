package com.company;

public class Main {

    public static void main(String[] args) {
    BubbleSort bubbleSort = new BubbleSort();
    SelectionSort selectionSort = new SelectionSort();
    InsertSort insertSort = new InsertSort();
    QuickSort quickSort = new QuickSort();
    HeapSort heapSort = new HeapSort();
    int[] arr = {4, 2, 1, 10, -1, 7, 0};
    bubbleSort.sort(arr);
    selectionSort.sort(arr);
    insertSort.sort(arr);
    quickSort.sort(arr, 0, arr.length - 1);
    heapSort.sort(arr);
    }
}
