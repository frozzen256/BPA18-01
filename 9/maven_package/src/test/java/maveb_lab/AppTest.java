package maveb_lab;

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
        int[] result = {2,4};
        App app = new App();
        int[] testarray = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] realresult = app.breakingRecords(testarray);
        assertEquals(result, realresult);
    }
}
