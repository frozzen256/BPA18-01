package main.java.com.rukosenpa;

public class Grid {
    private final String[] grid;

    public Grid(String[] grid) {
        this.grid = grid;
    }

    public boolean searchPattern(String[] pattern) {
        int gRowDim = grid[0].length();
        int pRowDim = pattern[0].length();

        int columnStart = 0, columnEnd = gRowDim;

        int i = 0;
        boolean result = false;
        int templateIndex = 0;
        String template = pattern[templateIndex++];
        while (!result && i < grid.length) {
            String row = grid[i];

            if (row.substring(columnStart, columnEnd).contains(template)) {
                if (row.indexOf(template) >= columnStart && row.lastIndexOf(template) + pRowDim <= columnEnd) {
                    columnStart = row.indexOf(template);
                    columnEnd = columnStart == row.lastIndexOf(template) ? columnStart + pRowDim : row.lastIndexOf(template) + pRowDim;
                    result = templateIndex == pattern.length;

                    if (!result) {
                        template = pattern[templateIndex++];
                    }
                }
            } else if (templateIndex > 1) {
                templateIndex = 1;
                template = pattern[templateIndex];
            }
            i++;
        }
        return result;
    }
}
