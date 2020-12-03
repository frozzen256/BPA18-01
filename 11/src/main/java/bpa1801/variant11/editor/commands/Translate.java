package bpa1801.variant11.editor.commands;

import bpa1801.variant11.editor.Coordinates;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.Coordinates.CoordinatesValues;

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
        CoordinatesValues currentValues = coordinates.getValues();
        switch (coordinates.getType()) {
            case Corners:
                figure.setCoordinates(new CoordinatesValues(
                    currentValues.value1 + dx,
                    currentValues.value2 + dy,
                    currentValues.value3 + dx,
                    currentValues.value4 + dy
                ));
                break;
            case Center:
                figure.setCoordinates(new CoordinatesValues(
                    currentValues.value1 + dx,
                    currentValues.value2 + dy,
                    currentValues.value3,
                    currentValues.value4
                ));
                break;
        }
    }

    protected void revertForFigure(Figure figure) {
        Coordinates coordinates = figure.getCoordinates();
        CoordinatesValues currentValues = coordinates.getValues();
        switch (coordinates.getType()) {
            case Corners:
                figure.setCoordinates(new CoordinatesValues(
                    currentValues.value1 - dx,
                    currentValues.value2 - dy,
                    currentValues.value3 - dx,
                    currentValues.value4 - dy
                ));
                break;
            case Center:
                figure.setCoordinates(new CoordinatesValues(
                    currentValues.value1 - dx,
                    currentValues.value2 - dy,
                    currentValues.value3,
                    currentValues.value4
                ));
                break;
        }
    }

    public String toString() {
        return String.format("%s dx: %f, dy: %f", super.toString(), dx, dy); 
    }
}
