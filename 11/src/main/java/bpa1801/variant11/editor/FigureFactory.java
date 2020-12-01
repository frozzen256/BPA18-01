package bpa1801.variant11.editor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bpa1801.variant11.editor.Coordinates.CoordinatesValues;
import bpa1801.variant11.editor.figures.Ellipse;
import bpa1801.variant11.editor.figures.Line;
import bpa1801.variant11.editor.figures.Rectangle;

public class FigureFactory {
    protected static Pattern pattern = Pattern.compile("^(rect|line|ellipse)\\[([^]]+)\\] (\\d+\\.?\\d*) (\\d+\\.?\\d*) (\\d+\\.?\\d*) (\\d+\\.?\\d*)$");

    public static Figure deserialize(String line) {
        Matcher matcher = pattern.matcher(line);
        Figure figure;
        if (matcher.matches()) {
            switch (matcher.group(1)) {
                case "ellipse":
                    figure = new Ellipse(matcher.group(2));
                    break;
                case "line":
                    figure = new Line(matcher.group(2));
                    break;
                case "rect":
                    figure = new Rectangle(matcher.group(2));
                    break;
                default:
                    return null;
            }
            CoordinatesValues values = new CoordinatesValues(
                Double.parseDouble(matcher.group(3)),
                Double.parseDouble(matcher.group(4)),
                Double.parseDouble(matcher.group(5)),
                Double.parseDouble(matcher.group(6))
            );
            figure.setCoordinates(values);
            return figure;
        }
        return null;
    }
}
