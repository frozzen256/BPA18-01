package bpa1801.variant11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    private static final ArrayList<Command> commands = new ArrayList<Command>();

    public static void main(String[] args) throws IOException {
        System.out.println("Specify scene file");
        readScene(scanner.nextLine());
        System.out.println("Specify commands file");
        readCommands(scanner.nextLine());
        run();
        System.out.println("Specify output file");
        writeScene(scanner.nextLine());
    }

    public static void run() {
        for (Command command : commands) {
            if (command.getName() != "undo") {
                state.commands.push(command);
            }
            System.out.println(String.format("Applying comand: %s", command.toString()));
            command.apply(state.buffer);
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

    public static void readCommands(String file) {
        FileLineReader reader = new FileLineReader(file);
        String line = reader.next();
        while (line != null) {
            Command command = CommandFactory.deserialize(line, state);
            if (command != null) {
                commands.add(command);
            } else {
                System.out.println(String.format("Wrong command line: %s", line));
            }
            line = reader.next();
        }
        System.out.println(String.format("Loaded %d command(s)", commands.size()));
    }

    public static void writeScene(String file) {
        try (FileWriter writer = new FileWriter(file)) {
            for (Figure figure: state.buffer.getFigures()) {
                writer.append(String.format("%s%s", figure.serialize(), System.lineSeparator()));
            }
        } catch (IOException ex) {
            System.out.println(String.format("Failed to write to file, reason: %s", ex.getMessage()));
        }
    }
}
