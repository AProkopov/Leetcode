package solutions_2026

class ContainsDuplicate {
    fun containsDuplicateSlowAndDump(nums: IntArray): Boolean {
        // no need for a HasMap actually. check better solution
        val map = mutableMapOf<Int, Int>()

        nums.forEach {
            map[it] = (map.getOrDefault(it, 0) + 1).also { value ->
                if (value > 1) return true
            }
        }

        return false
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        nums.forEach {
            if (it in set) {
                return true
            } else {
                set.add(it)
            }
        }

        return false
    }
}