class RotateArray {
    //NOT SOLVED
    fun rotate(nums: IntArray, k: Int): Unit {
        if (nums.size <= 1 || k == 0) return

        for (i in 0 .. k) {
            val tmpStart = nums[i]
            val tmpMid: Int? = if (k+i <= nums.lastIndex) nums[k+i] else null

            nums[i] = nums[nums.lastIndex - k + i]

            if (k+i <= nums.lastIndex) {
                nums[k+i] = tmpStart
                nums[nums[nums.lastIndex - k + i]] = tmpMid!!
            }

        }

        val x = 1

    }
}