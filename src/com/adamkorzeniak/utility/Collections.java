package com.adamkorzeniak.utility;

import java.util.List;

public class Collections {

    //TODO Compare with Collections.binarySearch
    public static int binarySearch(List<Comparable> list, Comparable element) {
        int start = 0;
        int end = list.size() - 1;
        if (end < 0) return -1;

        while (start <= end) {
            int middle = (end - start) / 2 + start;
            int compare = element.compareTo(list.get(middle));
            if (compare == 0) {
                return middle;
            } else if (compare > 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(List<Comparable> list, Comparable element) {
        if (list.isEmpty()) {
            return -1;
        }
        return binarySearchRecursive(list, 0, list.size()-1, element);
    }

    private static int binarySearchRecursive(List<Comparable> list, int start, int end, Comparable element) {
        if (start > end) {
            return -1;
        }
        int middle = (end - start) / 2 + start;

        int compare = element.compareTo(list.get(middle));
        if (compare == 0) {
            return middle;
        } else if (compare > 0) {
            start = middle + 1;
        } else {
            end = middle - 1;
        }
        return binarySearchRecursive(list, start, end,  element);
    }

    //TODO: search with duplicates
}