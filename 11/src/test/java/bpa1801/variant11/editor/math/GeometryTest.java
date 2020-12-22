package bpa1801.variant11.editor.math;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bpa1801.variant11.editor.math.Geometry.Point;

public class GeometryTest {
    @Test
    public void case1RotateRelativeTo()
    {
        Point point = Geometry.rotateRelativeTo(new Point(13, 7), new Point(16, 5), 45);
        assertTrue(point.x > 15.292);
        assertTrue(point.x < 15.293);
        assertTrue(point.y > 8.535);
        assertTrue(point.y < 8.536);
    }
}
