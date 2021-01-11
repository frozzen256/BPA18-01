import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


class TreeTest {

    @org.junit.jupiter.api.Test
    void getTreeHeight() {

        int t = 1;

        Tree spruce = new Tree();   // создание объекта spruce (ель)

        int actual = 0;
        for (int tItr = 0; tItr < t; tItr++) {
            spruce.n = 4;
            actual = spruce.getTreeHeight(spruce.n);    //  Вызов метода getTreeHeight у объекта spruce
        }
        int expected2 = 7;
        assertEquals(expected2, actual);
    }
}