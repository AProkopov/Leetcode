package solutions_2026

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        // Gauss Formula
        val n = nums.size
        return n * (n + 1) / 2 - nums.sum()
    }

    fun missingNumberStraightForwardSolution(nums: IntArray): Int {
        for (i in 0 .. nums.size) {
            if (i !in nums) return i
        }

        return -1
    }
}