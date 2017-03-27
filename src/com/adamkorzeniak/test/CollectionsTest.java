package com.adamkorzeniak.test;

import com.adamkorzeniak.utility.Collections;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionsTest {

    @Test
    public void BinarySearch_EmptyArray_ReturnsNegativeIndex() {
        List<Comparable> list = new ArrayList<>();
        int index = Collections.binarySearch(list, 1);
        assertEquals(-1, index);
    }

    @Test
    public void BinarySearch_ElementNotInOneSizeArray_ReturnsNegativeIndex() {
        List<Comparable> list = new ArrayList<>();
        list.add(2);
        int index = Collections.binarySearch(list, 1);
        assertEquals(-1, index);
    }

    @Test
    public void BinarySearch_ElementInOneSizeArray_Returns0() {
        List<Comparable> list = new ArrayList<>();
        list.add(2);
        int index = Collections.binarySearch(list, 2);
        assertEquals(0, index);
    }

    @Test
    public void BinarySearch_LargeArray_ReturnsIndex() {
        List<Comparable> list = new ArrayList<>();
        int value = -300;
        int adder = 0;
        for (int i = 0; i < 100; i++) {
            adder = adder%6 + 2;
            value += adder;
            list.add(value);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i += 2) {
            int index = Collections.binarySearch(list, list.get(i));
            assertEquals(i, index);
        }
        for (int i = 1; i < 10; i += 2) {
            int index = Collections.binarySearch(list, i*3);
            assertEquals(-1, index);
        }
    }

    @Test
    public void BinarySearchRecursive_EmptyArray_ReturnsNegativeIndex() {
        List<Comparable> list = new ArrayList<>();
        int index = Collections.binarySearchRecursive(list, 1);
        assertEquals(-1, index);
    }

    @Test
    public void BinarySearchRecursive_ElementNotInOneSizeArray_ReturnsNegativeIndex() {
        List<Comparable> list = new ArrayList<>();
        list.add(2);
        int index = Collections.binarySearchRecursive(list, 1);
        assertEquals(-1, index);
    }

    @Test
    public void BinarySearchRecursive_ElementInOneSizeArray_Returns0() {
        List<Comparable> list = new ArrayList<>();
        list.add(2);
        int index = Collections.binarySearchRecursive(list, 2);
        assertEquals(0, index);
    }

    @Test
    public void BinarySearchRecursive_LargeArray_ReturnsIndex() {
        List<Comparable> list = new ArrayList<>();
        int value = -300;
        int adder = 0;
        for (int i = 0; i < 100; i++) {
            adder = adder%6 + 2;
            value += adder;
            list.add(value);

        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i += 2) {
            int index = Collections.binarySearchRecursive(list, list.get(i));
            assertEquals(i, index);
        }
        for (int i = 1; i < 10; i += 2) {
            int index = Collections.binarySearchRecursive(list, i*3);
            assertEquals(-1, index);
        }
    }
}