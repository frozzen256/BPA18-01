package main.java.com.rukosenpa;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class Grid {
    private final String[] grid;

    public Grid(String[] grid) {
        this.grid = grid;
    }

    public boolean searchPattern(String[] pattern) {
        int gRowDim = grid[0].length();
        int pRowDim = pattern[0].length();
        Logger logger = Logger.getLogger(Grid.class.getName());
        logger.addHandler(new ConsoleHandler());

        int columnStart = 0, columnEnd = gRowDim;

        int i = 0;
        boolean result = false;
        int templateIndex = 0;
        String template = pattern[templateIndex++];
        while (!result && i < grid.length) {
            String row = grid[i];
            logger.info(String.format("Comparing %d pattern row with %d grid row...",templateIndex, i));
            if (row.substring(columnStart, columnEnd).contains(template)) {
                if (row.indexOf(template) >= columnStart && row.lastIndexOf(template) + pRowDim <= columnEnd) {
                    columnStart = row.indexOf(template);
                    columnEnd = columnStart == row.lastIndexOf(template) ? columnStart + pRowDim : row.lastIndexOf(template) + pRowDim;
                    result = templateIndex == pattern.length;

                    if (!result) {
                        template = pattern[templateIndex++];
                    }
                    logger.info("Pattern found");
                }
            } else if (templateIndex > 1) {
                templateIndex = 1;
                template = pattern[templateIndex];
            }
            logger.info(String.format("%d pattern row and %d grid row compared.", templateIndex, i));
            i++;
        }
        return result;
    }
}
