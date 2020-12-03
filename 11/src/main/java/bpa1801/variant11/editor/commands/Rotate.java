package bpa1801.variant11.editor.commands;

import bpa1801.variant11.editor.Figure;

public class Rotate extends AbstractGeneralCommand {
    private double angle;
    
    public Rotate(double angle) {
        this.angle = angle;
    }

    public String getName() {
        return "rotate";
    }

    protected void applyForFigure(Figure figure) {
        // TODO: implement
    }

    protected void revertForFigure(Figure figure) {
        // TODO: implement
    }

    public String toString() {
        return String.format("%s angle: %f", super.toString(), angle); 
    }
}
