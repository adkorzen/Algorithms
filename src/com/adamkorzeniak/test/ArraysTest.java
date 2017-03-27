package com.adamkorzeniak.test;

import org.junit.Test;

import static com.adamkorzeniak.utility.Arrays.max;
import static com.adamkorzeniak.utility.Arrays.min;
import static org.junit.Assert.assertEquals;


public class ArraysTest {

    @Test(expected=RuntimeException.class)
    public void Max_EmptyArray_ThrowsException() {
        max(new double[]{});
    }

    @Test
    public void Max_OneElement_ReturnsThatElement() {
        double max = max(new double[]{11});
        assertEquals(11, max, 0.0001);
    }

    @Test
    public void Max_SameElements_ReturnsThatElement() {
        double max = max(new double[]{11, 11, 11, 11, 11});
        assertEquals(11, max, 0.0001);
    }

    @Test
    public void Max_PositiveElements_ReturnsBiggest() {
        double max = max(new double[]{11, 22, 1, 112, 1122, 290, 1101});
        assertEquals(1122, max, 0.0001);
    }

    @Test
    public void Max_ArrayWithNegativeElements_ReturnsBiggest() {
        double max = max(new double[]{-21, -22, -13, -112, -22, -290, -1101});
        assertEquals(-13, max, 0.0001);
    }

    @Test
    public void Max_AllElements_ReturnsBiggest() {
        double max = max(new double[]{-21, 35, 123, -22, -13, 876, -112, 0, 22, -290, -1101});
        assertEquals(876, max, 0.0001);
    }

    @Test(expected=RuntimeException.class)
    public void Min_EmptyArray_ThrowsException() {
        min(new double[]{});
    }

    @Test
    public void Min_OneElement_ReturnsThatElement() {
        double min = min(new double[]{11});
        assertEquals(11, min, 0.0001);
    }

    @Test
    public void Min_SameElements_ReturnsThatElement() {
        double min = min(new double[]{11, 11, 11, 11, 11});
        assertEquals(11, min, 0.0001);
    }

    @Test
    public void Min_PositiveElements_ReturnsLowest() {
        double min = min(new double[]{11, 22, 3, 112, 1122, 290, 1101});
        assertEquals(3, min, 0.0001);
    }

    @Test
    public void Min_NegativeElements_ReturnsLowest() {
        double min = min(new double[]{-21, -22, -13, -112, -22, -290, -901});
        assertEquals(-901, min, 0.0001);
    }

}