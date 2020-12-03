package bpa1801.variant11.editor.commands;

import java.util.Stack;

import bpa1801.variant11.editor.Buffer;
import bpa1801.variant11.editor.Command;

public class Undo extends AbstractCommand {
    private Stack<Command> commands;

    public Undo(Stack<Command> commands) {
        this.commands = commands;
    }

    public String getName() {
        return "undo";
    }

    public void apply(Buffer buffer) {
        Command command = commands.pop();
        if (command != null) {
            command.revert(buffer);
        }
    }

    public void revert(Buffer buffer) {}
}
