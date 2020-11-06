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
        int result = App.lilysHomework(new int[] { 2, 3, 1 });
        assertSame(1, result);
    }

    @Test
    public void case2LilysHomeworkResultShouldBeCorrect()
    {
        int result = App.lilysHomework(new int[] { 2, 5, 3, 1 });
        assertSame(2, result);
    }

    @Test
    public void case3LilysHomeworkResultShouldBeCorrect()
    {
        int result = App.lilysHomework(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 });
        assertSame(0, result);
    }

    @Test
    public void case4LilysHomeworkResultShouldBeCorrect()
    {
        int result = App.lilysHomework(new int[] { 1, 2, 3, 4, 5 });
        assertSame(0, result);
    }

    @Test
    public void case5LilysHomeworkResultShouldBeCorrect()
    {
        int result = App.lilysHomework(new int[] { 3, 4, 2, 5, 1 });
        assertSame(2, result);
    }
}
