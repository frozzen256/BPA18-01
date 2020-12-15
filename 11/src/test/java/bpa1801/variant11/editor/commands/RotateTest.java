package bpa1801.variant11.editor.commands;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import bpa1801.variant11.editor.State;
import bpa1801.variant11.EditorApp;
import bpa1801.variant11.editor.EditorTestCase;

public class RotateTest extends EditorTestCase {
    @Test
    public void testRotateLine()
    {
        State state = createState(new String[]{
            "line[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "rotate line[1] 45"
        }, state));
        assertEquals("line[1] -0.414 1.000 2.414 1.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testRotateLineAndUndo()
    {
        State state = createState(new String[]{
            "line[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "rotate line[1] 45",
            "undo"
        }, state));
        assertEquals("line[1] 0.000 0.000 2.000 2.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testRotateRectangleShouldWorkOnlyFor90DegreesMod()
    {
        State state = createState(new String[]{
            "rect[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "rotate rect[1] 45"
        }, state));
        assertEquals("rect[1] 0.000 0.000 2.000 2.000", state.buffer.getFigures().get(0).serialize());
        EditorApp.run(state, createCommands(new String[] {
            "rotate rect[1] 90"
        }, state));
        assertEquals("rect[1] 0.000 2.000 2.000 0.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testRotateRectangleAndUndo()
    {
        State state = createState(new String[]{
            "rect[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "rotate rect[1] 90",
            "undo"
        }, state));
        assertEquals("rect[1] 0.000 0.000 2.000 2.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testRotateEllipseShouldWorkOnlyFor90DegreesMod()
    {
        State state = createState(new String[]{
            "ellipse[1] 0 0 2 3"
        });
        EditorApp.run(state, createCommands(new String[] {
            "rotate ellipse[1] 45"
        }, state));
        assertEquals("ellipse[1] 0.000 0.000 2.000 3.000", state.buffer.getFigures().get(0).serialize());
        EditorApp.run(state, createCommands(new String[] {
            "rotate ellipse[1] 90"
        }, state));
        assertEquals("ellipse[1] 0.000 0.000 3.000 2.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testRotateEllipseAndUndo()
    {
        State state = createState(new String[]{
            "ellipse[1] 0 0 2 3"
        });
        EditorApp.run(state, createCommands(new String[] {
            "rotate ellipse[1] 90",
            "undo"
        }, state));
        assertEquals("ellipse[1] 0.000 0.000 2.000 3.000", state.buffer.getFigures().get(0).serialize());
    }
}
