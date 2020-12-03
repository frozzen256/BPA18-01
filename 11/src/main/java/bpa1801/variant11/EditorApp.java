package bpa1801.variant11;

import java.io.IOException;
import java.util.Scanner;

import bpa1801.variant11.editor.Command;
import bpa1801.variant11.editor.CommandFactory;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.FigureFactory;
import bpa1801.variant11.editor.FileLineReader;
import bpa1801.variant11.editor.State;

public class EditorApp 
{

    private static final Scanner scanner = new Scanner(System.in);

    private static final State state = new State();

    public static void main(String[] args) throws IOException {
        System.out.println("Specify scene file");
        readScene(scanner.nextLine());
        System.out.println("Specify commands file");
        applyCommands(scanner.nextLine());
        for (Figure figure: state.buffer.getFigures()) {
            System.out.println(figure.serialize());
        }
    }

    public static void readScene(String file) {
        FileLineReader reader = new FileLineReader(file);
        String line = reader.next();
        while (line != null) {
            Figure figure = FigureFactory.deserialize(line);
            if (figure != null) {
                state.buffer.add(figure);
            } else {
                System.out.println(String.format("Wrong figure line: %s", line));
            }
            line = reader.next();
        }
        System.out.println(String.format("Loaded scene with %d figure(s)", state.buffer.size()));
    }

    public static void applyCommands(String file) {
        FileLineReader reader = new FileLineReader(file);
        String line = reader.next();
        while (line != null) {
            Command command = CommandFactory.deserialize(line, state);
            if (command != null) {
                if (command.getName() != "undo") {
                    state.commands.push(command);
                }
                System.out.println(String.format("Applying comand: %s", command.toString()));
                command.apply(state.buffer);
            } else {
                System.out.println(String.format("Wrong command line: %s", line));
            }
            line = reader.next();
        }
    }
}
