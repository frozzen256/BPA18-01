import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class findRectangleTest {
    @Test
    void findRectangleTest1() {
        int[] testHeights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String testWord = "abc";
        findRectangle findRectangleTester = new findRectangle(testHeights, testWord);

        assertEquals(findRectangleTester.designerPdfViewer(), 9);
    }

    @Test
    void findRectangleTest2() {
        int[] testHeights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String testWord = "zaba";

        findRectangle findRectangleTester = new findRectangle(testHeights, testWord);

        assertEquals(findRectangleTester.designerPdfViewer(), 28);
    }
}