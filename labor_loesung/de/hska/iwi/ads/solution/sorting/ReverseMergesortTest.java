package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseMergesortTest {
    
    @Test
    void testFullUnsortedList() {
        Integer[] a = {3, 2, 4, 7, 1};

        new ReverseMergesort<Integer>().reversesort(a, 0, 4);

        assertArrayEquals(new Integer[]{2, 3, 4, 7, 1}, a);
    }
    
}
