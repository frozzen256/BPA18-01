package bpa1801.variant11.editor.commands;

import bpa1801.variant11.editor.Buffer;
import bpa1801.variant11.editor.Figure;

public abstract class AbstractGeneralCommand extends AbstractCommand {
    public void apply(Buffer buffer) {
        if (forAll()) {
            for (Figure figure: buffer.getFigures()) {
                applyForFigure(figure);
            }
            return;
        }
        Figure figure = buffer.getByNameAndId(figureName, figureId);
        if (figure != null) {
            applyForFigure(figure);
        } else {
            System.out.println(String.format("Figure not found: %s[%s]", figureName, figureId));
        }
    }

    public void revert(Buffer buffer) {
        if (forAll()) {
            for (Figure figure: buffer.getFigures()) {
                revertForFigure(figure);
            }
            return;
        }
        Figure figure = buffer.getByNameAndId(figureName, figureId);
        if (figure != null) {
            revertForFigure(figure);
        } else {
            System.out.println(String.format("Figure not found: %s[%s]", figureName, figureId));
        }
    }

    protected abstract void applyForFigure(Figure figure);

    protected abstract void revertForFigure(Figure figure);
}
