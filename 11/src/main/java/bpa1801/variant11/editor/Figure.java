package bpa1801.variant11.editor;

public interface Figure {
    public String getId();

    public String getName();

    public void setId(String id);

    public String serialize();

    public Coordinates getCoordinates();

    public void setCoordinates(Coordinates.CoordinatesValues values);
}
