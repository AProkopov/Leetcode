package solutions_2026

import java.io.IOException

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //TODO try solving that with HashMap

        val diffList = mutableListOf<Int>()
        var index_1 = -1
        var index_2 = -1

        for (i in 0 .. nums.lastIndex) {
            val diff = target - nums[i]
            diffList.add(diff)
        }

        for (i in 0  .. nums.lastIndex) {
            if (nums[i] + diffList[i] == target && diffList[i] >= 0) {
                if (index_1 < 0) {
                    index_1 = i
                } else {
                    index_2 = i
                }

                if (index_1 > 0 && index_2 > 0) return intArrayOf(index_1, index_2)
            }
        }

        throw IOException("no solution")

    }

    fun twoSumX2(nums: IntArray, target: Int): IntArray {

        for(i in 0 until nums.lastIndex) {
            for(j in i + 1 .. nums.lastIndex) {
                if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }
        throw IOException("no solution")
    }
}