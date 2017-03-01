import java.util.ArrayList;
import java.util.List;

public class Point2D {

    private final int x;
    private final int y;

    private Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int closestDistance(List<Point2D> points) {
        int min = Integer.MAX_VALUE;

        for (Point2D first: points) {
            for (Point2D second: points) {
                if (first == second) {
                    continue;
                }
                int distance = distance(first, second);
                if (distance < min) {
                    min = distance;
                }
            }
        }
        return min;
    }

    public static int distance(Point2D first, Point2D second) {
        double underRoot = Math.pow((first.x - second.x), 2) + Math.pow((first.y - second.y),2);
        return (int) Math.pow(underRoot, 0.5);
    }

    public static void main(String[] args) {
        List<Point2D> points = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * 1000 - 500);
            int y = (int) (Math.random() * 1000 - 500);
            points.add(new Point2D(x, y));
        }
        System.out.println(closestDistance(points));

    }
}
