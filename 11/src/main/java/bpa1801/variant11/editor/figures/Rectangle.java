package bpa1801.variant11.editor.figures;

import java.util.Locale;

import bpa1801.variant11.editor.Coordinates;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.Coordinates.CoordinatesValues;
import bpa1801.variant11.editor.coordinates.CornerCoordinates;

public class Rectangle implements Figure {

    protected String id;

    protected CornerCoordinates coordinates;

    public Rectangle(String id)
    {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName()
    {
        return "rect";
    }

    public void setId(String id) {
        this.id = id;
    }

    public Coordinates getCoordinates()
    {
        return coordinates;
    }

    public void setCoordinates(CoordinatesValues values)
    {
        this.coordinates = new CornerCoordinates(values);
    }

    public String serialize()
    {
        return String.format(Locale.US, "%s[%s] %.3f %.3f %.3f %.3f", getName(), id, coordinates.x1, coordinates.y1, coordinates.x2, coordinates.y2);
    }
}
