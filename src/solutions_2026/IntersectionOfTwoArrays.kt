package solutions_2026

class IntersectionOfTwoArrays {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

        if (nums1.isEmpty() || nums2.isEmpty()) return IntArray(0)

        val set1 = mutableSetOf<Int>()
        val set2 = mutableSetOf<Int>()
        val resultList = mutableListOf<Int>()

        nums1.forEach {
            set1.add(it)
        }

        nums2.forEach {
            set2.add(it)
        }

        set1.forEach {
            if (set2.contains(it)) {
                resultList.add(it)
            }
        }

        return resultList.toIntArray()
    }

    fun intersectionOptimized(nums1: IntArray, nums2: IntArray): IntArray {
        if (nums1.isEmpty() || nums2.isEmpty()) return IntArray(0)

        val set1 = mutableSetOf<Int>()

        nums1.forEach {
            set1.add(it)
        }

        return nums2.filter { it in set1 }.toSet().toIntArray()
    }
}