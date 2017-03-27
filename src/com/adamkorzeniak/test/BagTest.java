package com.adamkorzeniak.test;

import com.adamkorzeniak.collection.Bag;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagTest {

    private Bag<Integer> bag;

    @Before
    public void setUp() {
        bag = new Bag();
    }

    @Test
    public void Add_AddSameObjectFewTimes_SizeEqualsOne() {
        int element = 17;
        for (int i = 0; i < 100; i++) {
            bag.add(element);
        }

        assertEquals(1, bag.size());
    }

    @Test
    public void Add_AddFew_CorrectSize() {
        for (int i = 0; i < 100; i++) {
            bag.add(i % 8);
        }

        assertEquals(8, bag.size());
    }

    @Test
    public void Size_AddFewAndRemoveLess_CorrectSize() {
        for (int i = 0; i < 100; i++) {
            bag.add(i % 8);
        }
        bag.remove(2);
        bag.remove(5);
        bag.remove(7);
        bag.remove(10);

        assertEquals(5, bag.size());
    }

    @Test
    public void Get_EmptyBag_ReturnsNull() {
        assertNull(bag.get(4));
    }

    @Test
    public void Get_OtherElement_ReturnsNull() {
        for (int i = 0; i < 8; i++) {
            bag.add(i % 8);
        }

        assertNull(bag.get(9));
    }

    @Test
    public void Get_ElementInBag_ReturnsElement() {
        for (int i = 0; i < 18; i++) {
            bag.add(i % 8);
        }

        assertEquals(new Integer(3), bag.get(3));
        assertEquals(new Integer(7), bag.get(7));
    }

    @Test
    public void Contains_EmptyBag_ReturnsFalse() {
        assertFalse(bag.contains(4));
    }

    @Test
    public void Contains_OtherElement_ReturnsFalse() {
        for (int i = 0; i < 8; i++) {
            bag.add(i % 8);
        }

        assertFalse(bag.contains(9));
    }

    @Test
    public void Contains_ElementInBag_ReturnsTrue() {
        for (int i = 0; i < 18; i++) {
            bag.add(i % 8);
        }

        assertTrue(bag.contains(3));
        assertTrue(bag.contains(7));
    }

    @Test
    public void IsEmpty_EmptyBag_ReturnsTrue() {
        assertTrue(bag.isEmpty());
    }

    @Test
    public void IsEmpty_AddAndRemove_ReturnsTrue() {
        int[] elements = {5, -20, 0, 15};
        for (int el : elements) {
            bag.add(el);
        }
        for (int el : elements) {
            bag.remove(el);
        }
        assertTrue(bag.isEmpty());
    }

    @Test
    public void IsEmpty_AddElement_ReturnsFalse() {
        bag.add(6);
        assertFalse(bag.isEmpty());
    }

    @Test
    public void IsEmpty_AddFewAndRemoveLess_ReturnsFalse() {
        int[] elements = {5, -20, 0, 15};
        for (int el : elements) {
            bag.add(el);
        }
        elements = new int[] {5, -20, 15};
        for (int el : elements) {
            bag.remove(el);
        }
        assertFalse(bag.isEmpty());
    }

    @Test
    public void Remove_EmptyBag_NotRemovedAndReturnsNull() {
        assertNull(bag.remove(4));
    }

    @Test
    public void Remove_NotInBag_NotRemovedAndReturnsNull() {
        for (int i = 0; i < 100; i++) {
            bag.add(i % 8);
        }
        assertNull(bag.remove(11));
        assertEquals(8, bag.size());
    }

    @Test
    public void Remove_ElementFromBag_RemovedAndReturnsElement() {
        for (int i = 0; i < 100; i++) {
            bag.add(i % 8);
        }
        assertEquals(new Integer(7), bag.remove(7));
        assertEquals(7, bag.size());
    }

    @Test
    public void CapacityTest() {
        for(int i = 0; i < 1000; i++) {
            bag.add(i);
        }
        for(int i = 0; i < 1000; i++) {
            bag.remove(i);
        }
    }
}