package bpa1801.variant11.editor.commands;

import bpa1801.variant11.editor.Buffer;
import bpa1801.variant11.editor.Figure;

public abstract class AbstractGeneralCommand extends AbstractCommand {
    public void apply(Buffer buffer) {
        if (forAll()) {
            for (Figure figure: buffer.getFigures()) {
                applyForFigure(figure);
            }
        }
        Figure figure = buffer.getByNameAndId(figureName, figureId);
        if (figure != null) {
            applyForFigure(figure);
        }
    }

    public void revert(Buffer buffer) {
        if (forAll()) {
            for (Figure figure: buffer.getFigures()) {
                revertForFigure(figure);
            }
        }
        Figure figure = buffer.getByNameAndId(figureName, figureId);
        if (figure != null) {
            revertForFigure(figure);
        }
    }

    protected abstract void applyForFigure(Figure figure);

    protected abstract void revertForFigure(Figure figure);
}
