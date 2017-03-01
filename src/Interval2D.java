public class Interval2D {
    private final double start;
    private final double end;

    public Interval2D(double first, double second) {
        this.start = Math.min(first, second);
        this.end = Math.max(first, second);
    }

    public boolean isIntersecting(Interval2D first, Interval2D second) {
        //FIXME
        if (first.end < second.start) {
            return false;
        }
        if (second.end < first.start) {
            return false;
        }
        return true;
    }
}
