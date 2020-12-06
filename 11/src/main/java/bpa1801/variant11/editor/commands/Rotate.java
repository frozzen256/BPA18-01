package bpa1801.variant11.editor.commands;

import bpa1801.variant11.editor.Coordinates;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.Coordinates.CoordinatesValues;
import bpa1801.variant11.editor.coordinates.CenterCoordinates;
import bpa1801.variant11.editor.coordinates.CornerCoordinates;
import bpa1801.variant11.editor.math.Geometry;
import bpa1801.variant11.editor.math.Geometry.Point;

public class Rotate extends AbstractGeneralCommand {
    private double angle;
    
    public Rotate(double angle) {
        this.angle = angle;
    }

    public String getName() {
        return "rotate";
    }

    protected void applyForFigure(Figure figure) {
        if (figure.getName() != "line" && angle % 90 != 0) {
            return;
        }
        rotateFigure(figure, angle);
    }

    protected void revertForFigure(Figure figure) {
        if (figure.getName() != "line" && angle % 90 != 0) {
            return;
        }
        rotateFigure(figure, -angle);
    }

    protected static void rotateFigure(Figure figure, double rotateAngle) {
        Coordinates coordinates = figure.getCoordinates();
        switch (coordinates.getType()) {
            case Corners: {
                CornerCoordinates c = as(CornerCoordinates.class, coordinates);
                Point center = new Geometry.Point(c.x1 + (c.x2 - c.x1) / 2, c.y2 + (c.y1 - c.y2) / 2);
                Point c1 = Geometry.rotateRelativeTo(new Point(c.x1, c.y1), center, rotateAngle);
                Point c2 = Geometry.rotateRelativeTo(new Point(c.x2, c.y2), center, rotateAngle);
                figure.setCoordinates(new CoordinatesValues(c1.x, c1.y, c2.x, c2.y));
                break;
            }
            case Center: {
                CenterCoordinates c = as(CenterCoordinates.class, coordinates);
                // NOTE: it's impossible to rotate ellipse using x,y,w,h
                figure.setCoordinates(new CoordinatesValues(
                    c.x,
                    c.y,
                    ((rotateAngle / 90) % 2 == 0 ? c.w : c.h),
                    ((rotateAngle / 90) % 2 == 0 ? c.h : c.w)
                ));
                break;
            }
        }
    }

    public String toString() {
        return String.format("%s angle: %.3f", super.toString(), angle); 
    }
}
