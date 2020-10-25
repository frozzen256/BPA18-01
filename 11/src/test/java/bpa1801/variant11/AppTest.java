package bpa1801.variant11;

import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void case1LilysHomeworkResultShouldBeCorrect()
    {
        assertSame(1, new LilysHomework(new int[] { 2, 3, 1 }).solve());
    }

    @Test
    public void case2LilysHomeworkResultShouldBeCorrect()
    {
        assertSame(2, new LilysHomework(new int[] { 2, 5, 3, 1 }).solve());
    }

    @Test
    public void case3LilysHomeworkResultShouldBeCorrect()
    {
        assertSame(0, new LilysHomework(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }).solve());
    }

    @Test
    public void case4LilysHomeworkResultShouldBeCorrect()
    {
        assertSame(0, new LilysHomework(new int[] { 1, 2, 3, 4, 5 }).solve());
    }

    @Test
    public void case5LilysHomeworkResultShouldBeCorrect()
    {
        assertSame(2, new LilysHomework(new int[] { 3, 4, 2, 5, 1 }).solve());
    }
}
