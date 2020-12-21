package bpa1801.variant11.editor;

import java.util.ArrayList;

public class Buffer {
    protected ArrayList<Figure> figures = new ArrayList<Figure>();

    public void add(Figure figure) {
        figures.add(figure);
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public Figure getByNameAndId(String name, String id) {
        for (Figure figure : figures) {
            if (figure.getName().equals(name) && figure.getId().equals(id)) {
                return figure;
            }
        }
        return null;
    }

    public int size() {
        return figures.size();
    }
}
