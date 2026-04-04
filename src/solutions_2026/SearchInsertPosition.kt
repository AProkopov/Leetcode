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

    fun searchInsertFaster(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val mid = (left + right) / 2

            if (nums[mid] == target) return mid

            if (target < nums[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }

        }

        return left
    }
}