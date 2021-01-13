package maavenlab.src.test.java.lab5;

import org.junit.Test;

import maven_package.src.main.java.maveb_lab.App;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        int result = {2};
        App app = new App();
        int[] test = {3,2,1,3};
        int resulttest = app.Candles(test);
        assertEquals(result, resulttest);
    }
}
