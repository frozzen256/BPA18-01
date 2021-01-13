package bpa1801.variant11.editor.coordinates;

import bpa1801.variant11.editor.Coordinates;

public class CenterCoordinates implements Coordinates {

    public final double x;

    public final double y;

    public final double w;

    public final double h;

    public CenterCoordinates(CoordinatesValues values)
    {
        x = values.value1;
        y = values.value2;
        w = values.value3;
        h = values.value4;
    }
    
    public CoordinatesType getType()
    {
        return CoordinatesType.Center;
    }

    public CoordinatesValues getValues()
    {
        return new CoordinatesValues(x, y, w, h);
    }
}
