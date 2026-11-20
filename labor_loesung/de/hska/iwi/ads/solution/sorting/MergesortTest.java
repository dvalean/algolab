package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MergesortTest {

    @Test
    void testEmptyList() {
        Integer[] a = {};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{}, a);
    }
    
    @Test
    void testReverseList() {
        Integer[] a = {3, 2, 1};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{1, 2, 3}, a);
    }
    
    @Test
    void testFullUnsortedList() {
        Integer[] a = {3, 2, 4, 7, 1};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 7}, a);
    }
    
    @Test
    void testFullSortedList() {
        Integer[] a = {1, 2, 3, 4, 5};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }
    
    @Test
    void testOneElement() {
        Integer[] a = {3};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{3}, a);
    }
    
    @Test
    void testTwoElements1() {
        Integer[] a = {5, 6};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{5, 6}, a);
    }
    
    @Test
    void testTwoElements2() {
        Integer[] a = {6, 5};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{5, 6}, a);
    }
    
    @Test
    void testOddList() {
        Integer[] a = {1, 6, 5};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{1, 5, 6}, a);
    }
    
    @Test
    void testEvenList() {
        Integer[] a = {1, 6, 5, 2};

        new Mergesort<Integer>().sort(a);

        assertArrayEquals(new Integer[]{1, 2, 5, 6}, a);
    }
}

