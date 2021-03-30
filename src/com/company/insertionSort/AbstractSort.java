package com.company.insertionSort;

public class AbstractSort {
    public static boolean less(int v, int w) {
        return v < w;
    }

    public static void swap (int[] elements, int a, int b) {
        int tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }
}
