package bpa1801.variant11.editor.commands;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import bpa1801.variant11.editor.State;
import bpa1801.variant11.EditorApp;
import bpa1801.variant11.editor.EditorTestCase;

public class TranslateTest extends EditorTestCase {
    @Test
    public void testTranslateLine()
    {
        State state = createState(new String[]{
            "line[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "translate line[1] 2 2"
        }, state));
        assertEquals("line[1] 2.000 2.000 4.000 4.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testTranslateLineAndUndo()
    {
        State state = createState(new String[]{
            "line[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "translate line[1] 2 2",
            "undo"
        }, state));
        assertEquals("line[1] 0.000 0.000 2.000 2.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testTranslateRectangle()
    {
        State state = createState(new String[]{
            "rect[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "translate rect[1] 2 2"
        }, state));
        assertEquals("rect[1] 2.000 2.000 4.000 4.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testTranslateRectangleAndUndo()
    {
        State state = createState(new String[]{
            "rect[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "translate rect[1] 2 2",
            "undo"
        }, state));
        assertEquals("rect[1] 0.000 0.000 2.000 2.000", state.buffer.getFigures().get(0).serialize());
    }
    
    @Test
    public void testTranslateEllipse()
    {
        State state = createState(new String[]{
            "ellipse[1] 0 0 3 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "translate ellipse[1] 2 2"
        }, state));
        assertEquals("ellipse[1] 2.000 2.000 3.000 2.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testTranslateEllipseAndUndo()
    {
        State state = createState(new String[]{
            "ellipse[1] 0 0 3 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "translate ellipse[1] 2 2",
            "undo"
        }, state));
        assertEquals("ellipse[1] 0.000 0.000 3.000 2.000", state.buffer.getFigures().get(0).serialize());
    }
}
