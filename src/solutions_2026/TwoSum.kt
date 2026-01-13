package solutions_2026

import java.io.IOException

class TwoSum {
    // O(n) both time and space
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for(i in 0 .. nums.lastIndex) {
            val diff = target - nums[i]
            if (map.containsKey(diff)) {
                return intArrayOf(map.get(diff)!!, i)
            }
            map[nums[i]] = i
        }

        return intArrayOf()
    }

    // O(n^2)
    fun twoSumX2(nums: IntArray, target: Int): IntArray {
        for(i in 0 until nums.lastIndex) {
            for(j in i + 1 .. nums.lastIndex) {
                if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }
        throw IOException("no solution")
    }
}