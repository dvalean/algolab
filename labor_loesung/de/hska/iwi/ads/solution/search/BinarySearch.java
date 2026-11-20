package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {
    @Override
    public int search(E[] a, E key, int left, int right){
        // edge cases for key not in the list either < or > than smallest or largest element:
        if (key.compareTo(a[left]) < 0)
            return left - 1;
        if (key.compareTo(a[right]) > 0)
            return right + 1;

        // key in the list:
        return binary_search(a, key, left, right);
    }

    private int binary_search(E[] a, E key, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int cmp = key.compareTo(a[mid]);

            if (cmp == 0) {
                // Edge case to find left most element:
                if (mid != 0 && key.compareTo(a[mid - 1]) == key.compareTo(a[mid]))
                    return binary_search(a, key, left, mid - 1);
                return mid;
            }
            else if (cmp < 0)
                return binary_search(a, key, left, mid - 1);

            return binary_search(a, key, mid + 1, right);
        }
        return left;
    }
}
