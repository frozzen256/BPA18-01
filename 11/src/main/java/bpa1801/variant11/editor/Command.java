package bpa1801.variant11.editor;

public interface Command {
    public String getName();

    public String getFigureName();

    public void setFigureName(String figureName);

    public String getFigureId();

    public void setFigureId(String figureId);

    public boolean forAll();

    public void apply(Buffer buffer);
    
    public void revert(Buffer buffer);
}
