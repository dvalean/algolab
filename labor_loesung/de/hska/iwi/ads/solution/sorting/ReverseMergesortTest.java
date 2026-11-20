package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseMergesortTest {
    
    @Test
    void testReverseMergesortList() {
        Integer[] a = {3, 2, 4, 7, 1};

        new ReverseMergesort<Integer>().reversesort(a, 0, 4);

        assertArrayEquals(new Integer[]{2, 3, 4, 7, 1}, a);
    }
    
    @Test
    void testReverseMergesortList1() {
        Integer[] a = {1, 1, 1, 1, 1};

        new ReverseMergesort<Integer>().reversesort(a, 0, 4);

        assertArrayEquals(new Integer[]{1, 1, 1, 1, 1}, a);
    }
    
    @Test
    void testReverseMergesortList2() {
        Integer[] a = {1, 2, 3, 7, 1};

        new ReverseMergesort<Integer>().reversesort(a, 0, 3);

        assertArrayEquals(new Integer[]{1, 2, 7, 3, 1}, a);
    }
    
}
