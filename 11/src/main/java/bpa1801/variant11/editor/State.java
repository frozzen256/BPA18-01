package bpa1801.variant11.editor;

import java.util.Stack;

public class State {
    public final Buffer buffer;
    public final Stack<Command> commands;

    public State() {
        buffer = new Buffer();
        commands = new Stack<Command>();
    }
}
