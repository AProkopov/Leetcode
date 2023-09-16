class CheckArrayRotated {
    //n^2 solution
    fun check(nums: IntArray): Boolean {
        val iterationsToRevert = nums.size - 1

        if (nums.isEmpty()) return true

        for (i in 0 ..iterationsToRevert) {
            if (isNonDecreasingArray(nums)) return true
            rotateArrayForOnePosition(nums)
        }

        return false
    }

    private fun isNonDecreasingArray(nums: IntArray): Boolean {
        nums.forEachIndexed { index, element ->
         if (index < nums.lastIndex) {
             if (element > nums[index + 1]) return false
         }
        }

        return true
    }

    private fun rotateArrayForOnePosition(nums: IntArray) {
        val tmpLastElement = nums.last()

        for (i in nums.lastIndex downTo 1) {
            nums[i] = nums[i-1]
        }

        nums[0] = tmpLastElement
    }
}