class NextGreaterElement {

    private val result = mutableListOf<Int>()

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.forEachIndexed { index, value1 ->
            var seekForGreater = false
            val lastResultSize = result.size

            for ((index, value2) in nums2.withIndex()) {
                if (value1 == value2) {
                    seekForGreater = true
                } else {
                    if (seekForGreater) {
                        if (value2 > value1) {
                            result.add(value2)
                            break
                        }
                    }
                }
            }

            also {
                seekForGreater = false
                if (result.size == lastResultSize) {
                    result.add(-1)
                }
            }
        }

        return result.toIntArray()
    }
}