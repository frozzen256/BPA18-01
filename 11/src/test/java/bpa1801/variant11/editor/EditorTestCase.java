package bpa1801.variant11.editor;

import java.util.ArrayList;
import java.util.List;

public class EditorTestCase {
    public static State createState(String[] lines) {
        Figure[] figures = new Figure[lines.length];
        for (int i = 0; i < lines.length; i++) {
            figures[i] = FigureFactory.deserialize(lines[i]);
        }
        return State.create(figures);
    }

    public static List<Command> createCommands(String[] lines, State state) {
        ArrayList<Command> commands = new ArrayList<Command>(lines.length);
        for (int i = 0; i < lines.length; i++) {
            commands.add(CommandFactory.deserialize(lines[i], state));
        }
        return commands;
    }
}
