import kotlin.math.max

class FindMaxAverage {

    fun findMaxAverageSlow(nums: IntArray, k: Int): Double {
        val avereges = mutableListOf<Double>()

        if (nums.size == 1) return nums.first().toDouble()

        nums.forEachIndexed { index, element ->
            if (index + k <= nums.size) {
                val subArray = nums.copyOfRange(index, index + k)
                val average = subArray.sum().toDouble() / subArray.size
                avereges.add(average)
            }
        }

        return avereges.max()
    }

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum: Int = 0
        var answer: Int = 0

        if (nums.size == 1) return nums[0].toDouble()
        if (k == 1) return nums.max().toDouble()

        for (i in 0 until k) {
            sum += nums[i]
        }

        answer = sum

        for (i in k until nums.size) {
            sum = sum + nums[i] - nums[i - k]
            answer = max(sum, answer)
        }

        return answer.toDouble() / k
    }
}