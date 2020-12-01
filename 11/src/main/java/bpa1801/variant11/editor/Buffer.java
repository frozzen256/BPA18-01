package bpa1801.variant11.editor;

import java.util.ArrayList;

public class Buffer {
    protected ArrayList<Figure> figures = new ArrayList<Figure>();

    public void add(Figure figure) {
        figures.add(figure);
    }

    public int size() {
        return figures.size();
    }
}
