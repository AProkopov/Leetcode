class FindMaxAverage {
    
    fun findMaxAverage(nums: IntArray, k: Int): Double {
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
}