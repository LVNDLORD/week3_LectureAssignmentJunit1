package org.example;

public class BinarySearchAndrii {
    public static int search(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;

    }

    public static int checkedSearch(int[] a, int x) {
        int index = search(a, x);
        if (index == -1) {
            throw new IllegalArgumentException("Element not found in the array");
        }
        return index;
    }
}