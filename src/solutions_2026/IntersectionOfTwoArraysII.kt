package solutions_2026

class IntersectionOfTwoArraysII {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val map1 = mutableMapOf<Int, Int>()
        val map2 = mutableMapOf<Int, Int>()

        val resultList = mutableListOf<Int>()

        nums1.forEach {
            map1.put(it, map1.getOrDefault(it, 0) + 1)
        }

        nums2.forEach {
            map2.put(it, map2.getOrDefault(it, 0) + 1)
        }

        map1.forEach { key, value ->
            if (map2.contains(key)) {
                val number = if (value <= map2[key]!!) value else map2[key]!!
                for (i in 0 until number) {
                    resultList.add(key)
                }
            }
        }

        return resultList.toIntArray()
    }

    fun intersectOptimized(nums1: IntArray, nums2: IntArray): IntArray {
        val map1 = mutableMapOf<Int, Int>()
        val resultList = mutableListOf<Int>()

        nums1.forEach {
            map1.put(it, map1.getOrDefault(it, 0) + 1)
        }


        nums2.forEach {
            val count = map1.getOrDefault(it, 0)

            if (count > 0) {
                resultList.add(it)
                map1[it] = count - 1
            }
        }

        return resultList.toIntArray()
    }
}