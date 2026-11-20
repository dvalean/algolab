package de.hska.iwi.ads.solution.sorting;

public class ReverseMergesort<E extends Comparable<E>> extends Mergesort<E> {
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
