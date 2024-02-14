class MissingNumber {
    fun missingNumber(nums: IntArray): Int {

        nums.sort()

        var missingNum = 0

        if (nums.last() < nums.size) return nums.size
        if (nums.first() != 0) return 0

        nums.forEachIndexed { index, num ->
            if (index != nums.lastIndex) {
                if (nums[index + 1] - num > 1) {
                    missingNum = num + 1
                    return missingNum
                }
            }
        }

        return -1
    }

    fun missingNumberWithOnTimeComplexity(nums: IntArray): Int {
        var indexSum = 0
        var numSum = 0

        nums.forEachIndexed {index, number ->
            indexSum += index + 1
            numSum += number
        }

        return indexSum - numSum
    }
}