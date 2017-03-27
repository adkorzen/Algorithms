package com.adamkorzeniak.test;

import com.adamkorzeniak.Interval1D;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Interval1DTest {

    @Test
    public void IsIntersecting_FirstLineBeforeSecond_NotIntersecting() {
        Interval1D first = new Interval1D(-1, 3);
        Interval1D second = new Interval1D(4, 7.8);
        assertFalse(first.isIntersecting(second));
        assertFalse(second.isIntersecting(first));
    }

    @Test
    public void IsIntersecting_SecondLineBeforeFirst_NotIntersecting() {
        Interval1D first = new Interval1D(-1, -3);
        Interval1D second = new Interval1D(-4, -7.8);
        assertFalse(first.isIntersecting(second));
        assertFalse(second.isIntersecting(first));
    }

    @Test
    public void IsIntersecting_FirstLineGoesIntoSecond_Intersecting() {
        Interval1D first = new Interval1D(-1, 3);
        Interval1D second = new Interval1D(2, 7.8);
        assertTrue(first.isIntersecting(second));
        assertTrue(second.isIntersecting(first));
    }

    @Test
    public void IsIntersecting_SecondLineGoesIntoFirst_Intersecting() {
        Interval1D first = new Interval1D(-1, -5);
        Interval1D second = new Interval1D(-4, -7.8);
        assertTrue(first.isIntersecting(second));
        assertTrue(second.isIntersecting(first));
    }

    @Test
    public void IsIntersecting_FirstLineInsideSecond_Intersecting() {
        Interval1D first = new Interval1D(6, 3);
        Interval1D second = new Interval1D(2, 7.8);
        assertTrue(first.isIntersecting(second));
        assertTrue(second.isIntersecting(first));
    }

    @Test
    public void IsIntersecting_SecondLineInsideFirst_Intersecting() {
        Interval1D first = new Interval1D(-1, -5);
        Interval1D second = new Interval1D(-4, -2);
        assertTrue(first.isIntersecting(second));
        assertTrue(second.isIntersecting(first));
    }

    @Test
    public void IsIntersecting_FirstEndMeetsSecondBeginning_Intersecting() {
        Interval1D first = new Interval1D(-1, -5);
        Interval1D second = new Interval1D(-1, 9);
        assertTrue(first.isIntersecting(second));
        assertTrue(second.isIntersecting(first));
    }

    @Test
    public void IsIntersecting_SecondEndMeetsFirstBeginning_Intersecting() {
        Interval1D first = new Interval1D(-1, -5);
        Interval1D second = new Interval1D(-5, -9);
        assertTrue(first.isIntersecting(second));
        assertTrue(second.isIntersecting(first));
    }
}