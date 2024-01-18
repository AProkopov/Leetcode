class SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String> {
        val resultList = mutableListOf<List<Long>>()
        val tmpList = mutableListOf<Long>()

        nums.forEachIndexed { index, i ->
            if (index != nums.lastIndex) {
                if (nums[index + 1].toLong() - i.toLong() > 1) {
                    tmpList.add(i.toLong())
                    resultList.add(mutableListOf<Long>().apply { addAll(tmpList) })
                    tmpList.clear()
                } else {
                    tmpList.add(i.toLong())
                }

            } else {
                tmpList.add(i.toLong())
                resultList.add(mutableListOf<Long>().apply { addAll(tmpList) })
                tmpList.clear()
            }
        }

        return combineArrayToRangeString(resultList)
    }

    private fun combineArrayToRangeString(list: List<List<Long>>): List<String> {
        val result = mutableListOf<String>()

        list.forEach {
            result.add(
                if (it.first() == it.last()) {
                    it.first().toString()
                } else {
                    ("${it.first()}->${it.last()}")
                }
            )
        }

        return result
    }
}