package bpa1801.variant11.editor.commands;

import bpa1801.variant11.editor.Command;

public abstract class AbstractCommand implements Command {

    protected String figureName;

    protected String figureId;

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public String getFigureId() {
        return figureId;
    }

    public void setFigureId(String figureId) {
        this.figureId = figureId;
    }

    public boolean forAll()
    {
        return figureName == null || figureId == null;
    }

    public String toString() {
        if (!forAll()) {
            return String.format("%s %s[%s]", getName(), figureName, figureId);
        }
        return String.format("%s", getName());
    }
}
