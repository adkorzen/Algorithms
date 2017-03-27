package com.adamkorzeniak.test;

import org.junit.Test;

import static com.adamkorzeniak.utility.Number.*;
import static org.junit.Assert.assertEquals;

public class NumberTest {

    @Test(expected = RuntimeException.class)
    public void LeastCommonMultiple_ValueUnder1_ThrowException() {
        leastCommonMultiple(2, 0);
    }

    @Test
    public void LeastCommonMultiple_OneAndOther_ReturnsOther() {
        int actual = leastCommonMultiple(11, 1);
        assertEquals(11, actual);
    }

    @Test
    public void LeastCommonMultiple_TwoPrimes_ReturnsBothMultiplied() {
        int actual = leastCommonMultiple(11, 7);
        assertEquals(11*7, actual);
    }

    @Test
    public void LeastCommonMultiple_OneMultiplierOfAnother_ReturnsBigger() {
        int actual = leastCommonMultiple(34, 68);
        assertEquals(68, actual);
    }

    @Test
    public void LeastCommonMultiple_FewValues_ReturnsLCM() {
        int actual1 = leastCommonMultiple(22, 33);
        int actual2 = leastCommonMultiple(8, 12);
        int actual3 = leastCommonMultiple(21, 35);
        int actual4 = leastCommonMultiple(38, 6);
        int actual5 = leastCommonMultiple(40, 88);

        assertEquals(66, actual1);
        assertEquals(24, actual2);
        assertEquals(7*3*5, actual3);
        assertEquals(2*19*3, actual4);
        assertEquals(8*5*11, actual5);
    }

    @Test
    public void GreatestCommonDivisor_BothZero_ReturnsZero() {
        int result = greatestCommonDivisor(0,0);
        assertEquals(0, result);
    }

    @Test
    public void GreatestCommonDivisor_ZeroAndDifferent_ReturnsDifferent() {
        int result1 = greatestCommonDivisor(0,21);
        int result2 = greatestCommonDivisor(0,-21);

        assertEquals(21, result1);
        assertEquals(21, result2);
    }

    @Test
    public void GreatestCommonDivisor_TwoPrimes_ReturnsOne() {
        int result = greatestCommonDivisor(11,17);
        assertEquals(1, result);
        int result2 = greatestCommonDivisor(-23,19);
        assertEquals(1, result2);
    }

    @Test
    public void GreatestCommonDivisor_TwoRelativePrimes_ReturnsOne() {
        int result = greatestCommonDivisor(11,27);
        assertEquals(1, result);
        int result2 = greatestCommonDivisor(-33,19);
        assertEquals(1, result2);
    }

    @Test
    public void GreatestCommonDivisor_FewValues_ReturnsGCD() {
        int result = greatestCommonDivisor(56, 24);
        assertEquals(8, result);
        int result2 = greatestCommonDivisor(-55,100);
        assertEquals(5, result2);
        int result3 = greatestCommonDivisor(-57,38);
        assertEquals(19, result3);
         int result4 = greatestCommonDivisor(-33,300);
        assertEquals(3, result4);
    }

    @Test @Deprecated
    public void DepGreatestCommonDivisor_BothZero_ReturnsZero() {
        int result = depGreatestCommonDivisor(0,0);
        assertEquals(0, result);
    }

    @Test @Deprecated
    public void DepGreatestCommonDivisor_ZeroAndDifferent_ReturnsDifferent() {
        int result1 = depGreatestCommonDivisor(0,21);
        int result2 = depGreatestCommonDivisor(0,-21);

        assertEquals(21, result1);
        assertEquals(21, result2);
    }

    @Test @Deprecated
    public void DepGreatestCommonDivisor_TwoPrimes_ReturnsOne() {
        int result = depGreatestCommonDivisor(11,17);
        assertEquals(1, result);
        int result2 = depGreatestCommonDivisor(-23,19);
        assertEquals(1, result2);
    }

    @Test @Deprecated
    public void DepGreatestCommonDivisor_TwoRelativePrimes_ReturnsOne() {
        int result = depGreatestCommonDivisor(11,27);
        assertEquals(1, result);
        int result2 = depGreatestCommonDivisor(-33,19);
        assertEquals(1, result2);
    }

    @Test @Deprecated
    public void DepGreatestCommonDivisor_FewValues_ReturnsGCD() {
        int result = depGreatestCommonDivisor(56, 24);
        assertEquals(8, result);
        int result2 = depGreatestCommonDivisor(-55,100);
        assertEquals(5, result2);
        int result3 = depGreatestCommonDivisor(-57,38);
        assertEquals(19, result3);
        int result4 = depGreatestCommonDivisor(-33,300);
        assertEquals(3, result4);
    }
}