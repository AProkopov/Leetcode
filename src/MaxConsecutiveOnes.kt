class MaxConsecutiveOnes {

    private var maxConsecutiveLength = 0
    private val targetValue = 1
    private var currentConsecutiveLength = 0

    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        nums.forEach {
            if (it == targetValue) {
                currentConsecutiveLength++
                if (currentConsecutiveLength > maxConsecutiveLength) {
                    maxConsecutiveLength = currentConsecutiveLength
                }
            } else {
                currentConsecutiveLength = 0
            }
        }

        return maxConsecutiveLength
    }

}