package main.java.com.rukosenpa;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

class GridTestTrue {
    @Test
    void searchPatternTrue() {
        String[] initialGrid = new String[]{
                "7283455864",
                "6731158619",
                "8988242643",
                "3830589324",
                "2229505813",
                "5633845374",
                "6473530293",
                "7053106601",
                "0834282956",
                "4607924137"
        };

        String[] pattern = new String[]{
                "9505",
                "3845",
                "3530"
        };

        Grid testGrid = new Grid(initialGrid);
        assertTrue(testGrid.searchPattern(pattern));

    }

    @Test
    void searchPatternFalse() {
        String[] initialGrid = new String[]{
                "400453592126560",
                "114213133098692",
                "474386082879648",
                "522356951189169",
                "887109450487496",
                "252802633388782",
                "502771484966748",
                "075975207693780",
                "511799789562806",
                "404007454272504",
                "549043809916080",
                "962410809534811",
                "445893523733475",
                "768705303214174",
                "650629270887160"
        };

        String[] pattern = new String[]{
                "99",
                "99"
        };

        Grid grid = new Grid(initialGrid);

        assertFalse(grid.searchPattern(pattern));
    }
}