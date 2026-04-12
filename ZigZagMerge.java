package org.example;

public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6, 7, 8};

        int c[] = zigZagMerge(a, b);

        for (int num : c) {
            System.out.print(num + " ");
        }
    }

    public static int[] zigZagMerge(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int c[] = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Zig-zag merge
        while (i < n && j < m) {
            c[k++] = a[i++];

            c[k++] = b[j++];
        }

        // Remaining elements
        while (i < n) {
            c[k++] = a[i++];
        }

        while (j < m) {
            c[k++] = b[j++];
        }

        return c;
    }
}
