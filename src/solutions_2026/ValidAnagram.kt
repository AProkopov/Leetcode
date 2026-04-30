package solutions_2026

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val map = mutableMapOf<Char, Int>()

        s.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        t.forEach {
            map[it] = map.getOrDefault(it, 0) - 1
        }

        return !map.values.any { it != 0 }
    }

    fun isAnagramFasterSolution(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val array = IntArray(26)

        s.forEach { char ->
            array[char - 'a']++
        }
        t.forEach { char ->
            array[char - 'a']--
        }

        return array.none { it != 0 }
    }
}