package solutions_2026

class MajorityElement {
    fun majorityElementSlower(nums: IntArray): Int {
        val map = hashMapOf<Int, Int>()
        val majorityCriteria = nums.size / 2

        nums.forEach {
            map[it] = (map.getOrDefault(it, 0) + 1).also { value ->
                if (value > majorityCriteria) return it
            }

        }

        return -1
    }

    fun majorityElementBoyerMoore(nums: IntArray): Int {
        var candidate = nums[0]
        var votes = 1

        for (i in 1 until  nums.size) {
            if (votes == 0) candidate = nums[i]
            votes +=(if (nums[i] == candidate) 1 else -1)
        }

        return candidate
    }
}