package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    void testReverseArray1() {
        Integer[] a = {3, 2, 1};

        new ReverseArray<Integer>().reverse(a, 0, 2);

        assertArrayEquals(new Integer[]{1, 2, 3}, a);
    }

    @Test
    void testReverseArray2() {
        Integer[] a = {3, 1, 2};

        new ReverseArray<Integer>().reverse(a, 0, 2);

        assertArrayEquals(new Integer[]{2, 1, 3}, a);
    }

    @Test
    void testReverseArray3() {
        Integer[] a = {3, 2, 1, 4, 5, 5};

        new ReverseArray<Integer>().reverse(a, 0, 4);

        assertArrayEquals(new Integer[]{5, 4, 1, 2, 3, 5}, a);
    }
    
}
