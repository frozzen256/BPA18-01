package bpa1801.variant11.editor.coordinates;

import bpa1801.variant11.editor.Coordinates;

public class CornerCoordinates implements Coordinates {

    public final double x1;

    public final double y1;

    public final double x2;

    public final double y2;

    public CornerCoordinates(CoordinatesValues values)
    {
        x1 = values.value1;
        y1 = values.value2;
        x2 = values.value3;
        y2 = values.value4;
    }
    
    public CoordinatesType getType()
    {
        return CoordinatesType.Center;
    }

    public CoordinatesValues getValues()
    {
        return new CoordinatesValues(x1, y1, x2, y2);
    }
}
