package bpa1801.variant11.editor.commands;

import java.util.Locale;

import bpa1801.variant11.editor.Coordinates;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.Coordinates.CoordinatesValues;
import bpa1801.variant11.editor.coordinates.CenterCoordinates;
import bpa1801.variant11.editor.coordinates.CornerCoordinates;

public class Translate extends AbstractGeneralCommand {
    private double dx;

    private double dy;
    
    public Translate(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public String getName() {
        return "translate";
    }

    protected void applyForFigure(Figure figure) {
        Coordinates coordinates = figure.getCoordinates();
        switch (coordinates.getType()) {
            case Corners: {
                CornerCoordinates c = as(CornerCoordinates.class, coordinates);
                figure.setCoordinates(new CoordinatesValues(
                    c.x1 + dx,
                    c.y1 + dy,
                    c.x2 + dx,
                    c.y2 + dy
                ));
                break;
            }
            case Center: {
                CenterCoordinates c = as(CenterCoordinates.class, coordinates);
                figure.setCoordinates(new CoordinatesValues(c.x + dx, c.y + dy, c.w, c.h));
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
                    c.x1 - dx,
                    c.y1 - dy,
                    c.x2 - dx,
                    c.y2 - dy
                ));
                break;
            }
            case Center: {
                CenterCoordinates c = as(CenterCoordinates.class, coordinates);
                figure.setCoordinates(new CoordinatesValues(c.x - dx, c.y - dy, c.w, c.h));
                break;
            }
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s dx: %.3f, dy: %.3f", super.toString(), dx, dy); 
    }
}
