package bpa1801.variant11.editor;

import java.util.regex.Pattern;

import bpa1801.variant11.editor.commands.Rotate;
import bpa1801.variant11.editor.commands.Scale;
import bpa1801.variant11.editor.commands.Translate;
import bpa1801.variant11.editor.commands.Undo;
import java.util.regex.Matcher;

public class CommandFactory {
    protected static Pattern pattern = Pattern.compile("(?<command>[^\\s]+)(\\s?(?<figure>[^\\[]+)\\[(?<figureId>[^\\]]+)\\]){0,1}.*");
    protected static Pattern translateArgs = Pattern.compile(".* (\\d+\\.?\\d*) (\\d+\\.?\\d*)");
    protected static Pattern scaleArgs = Pattern.compile(".* (\\d+\\.?\\d*) (\\d+\\.?\\d*)");
    protected static Pattern rotateArgs = Pattern.compile(".* (\\d+\\.?\\d*)$");

    public static Command deserialize(String line, State state) {
        Matcher matcher = pattern.matcher(line);
        Matcher argMatcher;
        Command command;
        if (matcher.matches()) {
            switch (matcher.group("command")) {
                case "translate":
                    argMatcher = translateArgs.matcher(line);
                    if (!argMatcher.matches()) {
                        return null;
                    }
                    command = new Translate(
                        Double.parseDouble(argMatcher.group(1)),
                        Double.parseDouble(argMatcher.group(2))
                    );
                    break;
                case "scale":
                    argMatcher = scaleArgs.matcher(line);
                    if (!argMatcher.matches()) {
                        return null;
                    }
                    command = new Scale(
                        Double.parseDouble(argMatcher.group(1)),
                        Double.parseDouble(argMatcher.group(2))
                    );
                    break;
                case "rotate":
                    argMatcher = rotateArgs.matcher(line);
                    if (!argMatcher.matches()) {
                        return null;
                    }
                    command = new Rotate(
                        Double.parseDouble(argMatcher.group(1))
                    );
                    break;
                case "undo":
                    command = new Undo(state.commands);
                    break;
                default:
                    return null;
            }
            String figureName = matcher.group("figure");
            String figureId = matcher.group("figureId");
            if (figureName != null && figureId != null) {
                command.setFigureName(figureName);
                command.setFigureId(figureId);
            }
            return command;
        }
        return null;
    }
}
