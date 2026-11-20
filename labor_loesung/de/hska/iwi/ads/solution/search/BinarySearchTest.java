package de.hska.iwi.ads.solution.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;

public class BinarySearchTest extends SearchTest {
    @Override
    public <E extends Comparable<E>> Search<E> createSearch() {
        return new BinarySearch<>();
    }

    @Test 
    void testBinarySearchAllTheSame() {
        Search<Integer> search = createSearch();
        Integer [] a = {3, 3, 3, 3, 3};
        
        assertEquals(0, search.search(a, 3));
    }

    @Test 
    void testBinarySearchAllTheSameSubList() {
        Search<Integer> search = createSearch();
        Integer [] a = {3, 3, 3, 3, 3};
        
        assertEquals(1, search.search(a, 3, 1, 3));
    }

    @Test 
    void testBinarySearchAllTheSameSmaller() {
        Search<Integer> search = createSearch();
        Integer [] a = {3, 3, 3, 3, 3};
        
        assertEquals(0, search.search(a, 2, 1, 3));
    }

    @Test 
    void testBinarySearchAllTheSameLarger() {
        Search<Integer> search = createSearch();
        Integer [] a = {3, 3, 3, 3, 3};
        
        assertEquals(4, search.search(a, 4, 1, 3));
    }

    @Test 
    void testBinarySearchMissingInBetween() {
        Search<Integer> search = createSearch();
        Integer [] a = {1, 1, 3, 3, 3};
        
        // Special case a[i-1] < key < a[i]:
        assertEquals(2, search.search(a, 2));
        
        Integer [] b = {1, 1, 1, 3, 3};
        assertEquals(3, search.search(b, 2));
    }
}
