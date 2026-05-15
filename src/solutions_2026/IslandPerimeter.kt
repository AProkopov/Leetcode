package solutions_2026

class IslandPerimeter {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var p = 0

        grid.forEachIndexed { indexRows, ints ->
            ints.forEachIndexed { indexColumns, i ->
                if (i != 0) {
                    if (indexColumns == 0) p++
                    if (indexColumns == ints.lastIndex) p++
                    if (indexRows == 0) p++
                    if (indexRows == grid.lastIndex) p++

                    if (indexColumns != 0) {
                        if (ints[indexColumns - 1] != 1) p++
                    }

                    if (indexColumns != ints.lastIndex) {
                        if (ints[indexColumns + 1] != 1) p++
                    }

                    if (indexRows != 0) {
                        if (grid[indexRows - 1][indexColumns] != 1) p++
                    }

                    if (indexRows != grid.lastIndex) {
                        if (grid[indexRows + 1][indexColumns] != 1) p++
                    }
                }
            }
        }

        return p
    }
}