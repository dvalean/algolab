package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {
    @Override
    public void reverse(E[] array, int from, int to) {
        while (from < to) {
            E temp = array[from];
            array[from] = array[to];
            array[to] = temp;
            from++;
            to--;
        }
    }
}
