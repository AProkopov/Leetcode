package solutions_2026

class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {

        nums.forEachIndexed { index, i ->
            if (i == target) {
                return index
            }

            if (index == 0 && target < i) return 0
            if (index == nums.lastIndex && target > i) return nums.lastIndex + 1

            if (index > 0) {
                if (target > nums[index -1] && target < i) return index
            }
        }

        return -1

    }
}