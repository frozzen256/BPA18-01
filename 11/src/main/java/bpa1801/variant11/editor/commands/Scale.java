package bpa1801.variant11.editor.commands;

import bpa1801.variant11.editor.Coordinates;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.Coordinates.CoordinatesValues;

public class Scale extends AbstractGeneralCommand {
    private double sx;

    private double sy;
    
    public Scale(double sx, double sy) {
        this.sx = sx;
        this.sy = sy;
    }

    public String getName() {
        return "scale";
    }

    protected void applyForFigure(Figure figure) {
        // TODO: fix for line
        Coordinates coordinates = figure.getCoordinates();
        CoordinatesValues currentValues = coordinates.getValues();
        switch (coordinates.getType()) {
            case Corners:
                double x1 = currentValues.value1;
                double y1 = currentValues.value2;
                double x2 = currentValues.value3;
                double y2 = currentValues.value4;
                figure.setCoordinates(new CoordinatesValues(
                    x1,
                    y1,
                    x2 + (x2 - x1) * sx,
                    y2 + (y2 - y1) * sy
                ));
                break;
            case Center:
                figure.setCoordinates(new CoordinatesValues(
                    currentValues.value1,
                    currentValues.value2,
                    currentValues.value3 * sx,
                    currentValues.value4 * sy
                ));
                break;
        }
    }

    protected void revertForFigure(Figure figure) {
        Coordinates coordinates = figure.getCoordinates();
        CoordinatesValues currentValues = coordinates.getValues();
        switch (coordinates.getType()) {
            case Corners:
                double x1 = currentValues.value1;
                double y1 = currentValues.value2;
                double x2 = currentValues.value3;
                double y2 = currentValues.value4;
                figure.setCoordinates(new CoordinatesValues(
                    x1,
                    y1,
                    (x2 + sx * x1) / (1 + sx),
                    (y2 + sy * y1) / (1 + sy)
                ));
                break;
            case Center:
                figure.setCoordinates(new CoordinatesValues(
                    currentValues.value1,
                    currentValues.value2,
                    currentValues.value3 / sx,
                    currentValues.value4 / sy
                ));
                break;
        }
    }

    public String toString() {
        return String.format("%s sx: %f, sy: %f", super.toString(), sx, sy); 
    }
}
