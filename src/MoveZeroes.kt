class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var position = 0
        nums.forEachIndexed { index ,element ->
            if(element != 0 ) {
                nums[position] = element
                position++
            }
        }

        for (i in position .. nums.lastIndex) {
            nums[i] = 0
        }
    }
}