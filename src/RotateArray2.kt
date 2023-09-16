class RotateArray2 {
    fun rotateN2(nums: IntArray, k: Int): Unit {

        for (i in 0 until k) {
            val tmpLast = nums.last()

            for (j in nums.lastIndex downTo 1) {
                nums[j] = nums[j-1]
            }

            nums[0] = tmpLast
        }
    }

    fun rotate(nums: IntArray, k: Int): Unit {
        if (nums.size <= 1) {
            return
        }

        val optimizedK = k % nums.size
        val breakIndex = nums.lastIndex - optimizedK

        reverse(nums, 0, breakIndex)
        reverse(nums, breakIndex + 1, nums.lastIndex)
        reverse(nums, 0, nums.lastIndex)
    }

    private fun reverse(nums: IntArray, from: Int, to: Int) {
        var start = from
        var end = to

        while (start < end) {
            val temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start++
            end--
        }
    }
}