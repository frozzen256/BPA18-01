package bpa1801.variant11.editor.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import bpa1801.variant11.editor.State;
import bpa1801.variant11.EditorApp;
import bpa1801.variant11.editor.EditorTestCase;

public class ScaleTest extends EditorTestCase {
    @Test
    public void testShouldThrowErrorOnBadParams() {
        try {
            createCommands(new String[] {
                "scale line[1] 2 0"
            }, createState(new String[] {}));
        } catch (IllegalArgumentException ex) {
            assertTrue(true);
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testScaleLine()
    {
        State state = createState(new String[]{
            "line[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "scale line[1] 2 1"
        }, state));
        assertEquals("line[1] 0.000 0.000 4.000 2.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testScaleLineAndUndo()
    {
        State state = createState(new String[]{
            "line[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "scale line[1] 2 1",
            "undo"
        }, state));
        assertEquals("line[1] 0.000 0.000 2.000 2.000", state.buffer.getFigures().get(0).serialize());
    }
    
    @Test
    public void testScaleRectangle()
    {
        State state = createState(new String[]{
            "rect[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "scale rect[1] 2 1"
        }, state));
        assertEquals("rect[1] 0.000 0.000 4.000 2.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testScaleRectangleAndUndo()
    {
        State state = createState(new String[]{
            "rect[1] 0 0 2 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "scale rect[1] 2 1",
            "undo"
        }, state));
        assertEquals("rect[1] 0.000 0.000 2.000 2.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testScaleEllipse()
    {
        State state = createState(new String[]{
            "ellipse[1] 0 0 3 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "scale ellipse[1] 3 2"
        }, state));
        assertEquals("ellipse[1] 0.000 0.000 9.000 4.000", state.buffer.getFigures().get(0).serialize());
    }

    @Test
    public void testScaleEllipseAndUndo()
    {
        State state = createState(new String[]{
            "ellipse[1] 0 0 3 2"
        });
        EditorApp.run(state, createCommands(new String[] {
            "scale ellipse[1] 3 2",
            "undo"
        }, state));
        assertEquals("ellipse[1] 0.000 0.000 3.000 2.000", state.buffer.getFigures().get(0).serialize());
    }
}
