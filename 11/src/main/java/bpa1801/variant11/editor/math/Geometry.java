package bpa1801.variant11.editor.math;

public class Geometry {

    public static class Point {
        public final double x;
        public final double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * 
     * @param point
     * @param anchor
     * @param angle Clockwise rotation angle in degrees
     * @return
     */
    public static Point rotateRelativeTo(Point point, Point anchor, double angle) {
        double x = point.x - anchor.x;
        double y = point.y - anchor.y;
        // Invert angle because formula is for counterclockwise rotation
        double angrad = Math.toRadians(-angle);
        double x1 = x * Math.cos(angrad) - y * Math.sin(angrad);
        double y1 = x * Math.sin(angrad) + y * Math.cos(angrad);
        return new Point(x1 + anchor.x, y1 + anchor.y);
    }
}
