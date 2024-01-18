class MissingRanges {

    /**
    Input: nums = [0,1,3,50,75], lower = 0, upper = 99
    Output: [[2,2],[4,49],[51,74],[76,99]]
    Explanation: The ranges are:
    [2,2]
    [4,49]
    [51,74]
    [76,99]
     */

    fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<List<Int>> {

        if (nums.isEmpty()) return listOf(listOf(lower, upper))

        val result = mutableListOf<List<Int>>()

        val map = mutableMapOf<Int, Int>()

        for (x in lower .. upper) {
            map.put(x, 1)
        }

        nums.forEach {
            map.put(it, 0)
        }

        val valuesToBuildRanges = map.filterValues { it != 0 }.keys.toIntArray().apply { sort() }
        if (valuesToBuildRanges.size == 1) return listOf(listOf(valuesToBuildRanges.first(), valuesToBuildRanges.first()))

        val tmpList = mutableListOf<Int>()
        var previousValue: Int = 0
        valuesToBuildRanges.forEachIndexed { index, value ->
            if (tmpList.isEmpty()) {
                tmpList.add(if (index == 0) value else previousValue)
                previousValue = value
                return@forEachIndexed
            }

            if (value - previousValue > 1 || index == valuesToBuildRanges.lastIndex) {
                tmpList.add(if (index == valuesToBuildRanges.lastIndex) value else previousValue)
                result.add(listOf(tmpList[0], tmpList[1]))
                tmpList.clear()
            }

            previousValue = value

        }

        return result
    }

}