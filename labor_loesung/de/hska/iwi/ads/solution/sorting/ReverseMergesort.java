package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public class ReverseMergesort<E extends Comparable<E>> extends AbstractMergesort<E> {

    @Override
    protected void mergesort(E[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergesort(a, left, mid);
            mergesort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    private void merge(E[] a, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (a[i].compareTo(a[j]) <= 0) {
                b[k] = a[i];
                k++;
                i++;
            } else {
                b[k] = a[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            b[k] = a[i];
            k++;
            i++;
        }

        while (j <= right) {
            b[k] = a[j];
            k++;
            j++;
        }

        for (i = left; i <= right; i++) {
            a[i] = b[i];
        }
    }

    protected void reversesort(E[] a, int left, int right) {
        b = a.clone();
        if (left < right) {
            int mid = (left + right) / 2;
            mergesort(a, left, mid);
            mergesort(a, mid + 1, right);
            new ReverseArray<E>().reverse(a, mid + 1, right);
        }
    }
}
