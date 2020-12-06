package bpa1801.variant11.editor.commands;

import java.util.Locale;

import bpa1801.variant11.editor.Coordinates;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.Coordinates.CoordinatesValues;
import bpa1801.variant11.editor.coordinates.CenterCoordinates;
import bpa1801.variant11.editor.coordinates.CornerCoordinates;

public class Scale extends AbstractGeneralCommand {
    private double sx;

    private double sy;
    
    public Scale(double sx, double sy) {
        assert sx != 0;
        assert sy != 0;
        this.sx = sx;
        this.sy = sy;
    }

    public String getName() {
        return "scale";
    }

    protected void applyForFigure(Figure figure) {
        Coordinates coordinates = figure.getCoordinates();
        switch (coordinates.getType()) {
            case Corners: {
                CornerCoordinates c = as(CornerCoordinates.class, coordinates);
                figure.setCoordinates(new CoordinatesValues(
                    c.x1,
                    c.y1,
                    c.x2 + (c.x2 - c.x1) * (sx - 1),
                    c.y2 + (c.y2 - c.y1) * (sy - 1)
                ));
                break;
            }
            case Center: {
                CenterCoordinates c = as(CenterCoordinates.class, coordinates);
                figure.setCoordinates(new CoordinatesValues(c.x, c.y, c.w * sx, c.h * sy));
                break;
            }
        }
    }

    protected void revertForFigure(Figure figure) {
        Coordinates coordinates = figure.getCoordinates();
        switch (coordinates.getType()) {
            case Corners: {
                CornerCoordinates c = as(CornerCoordinates.class, coordinates);
                figure.setCoordinates(new CoordinatesValues(
                    c.x1,
                    c.y1,
                    (c.x2 + (sx - 1) * c.x1) / sx,
                    (c.y2 + (sy - 1) * c.y1) / sy
                ));
                break;
            }
            case Center: {
                CenterCoordinates c = as(CenterCoordinates.class, coordinates);
                figure.setCoordinates(new CoordinatesValues(c.x, c.y, c.w / sx, c.h / sy));
                break;
            }
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s sx: %.3f, sy: %.3f", super.toString(), sx, sy); 
    }
}
