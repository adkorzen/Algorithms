package com.adamkorzeniak;

public class Interval1D {
    private final double start;
    private final double end;

    public  Interval1D(double first, double second) {
        this.start = Math.min(first, second);
        this.end = Math.max(first, second);
    }

    public boolean isIntersecting(Interval1D other) {
        return !(this.end < other.start || other.end < this.start);
    }
}
