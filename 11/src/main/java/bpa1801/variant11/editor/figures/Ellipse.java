package bpa1801.variant11.editor.figures;

import bpa1801.variant11.editor.Coordinates;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.Coordinates.CoordinatesValues;
import bpa1801.variant11.editor.coordinates.CenterCoordinates;

public class Ellipse implements Figure {

    protected String id;

    protected CenterCoordinates coordinates;

    public Ellipse(String id)
    {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName()
    {
        return "ellipse";
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
        this.coordinates = new CenterCoordinates(values);
    }


    public String serialize()
    {
        return String.format("%s[%s] %.3f %.3f %.3f %.3f", getName(), id, coordinates.x, coordinates.y, coordinates.w, coordinates.h);
    }
}
