class FirstUniqueCharacter {

    companion object {
        fun firstUniqChar(s: String): Int {

            val chars = s.toCharArray()
            val map = mutableMapOf<Char, Int>()

            chars.forEach {
                map.put(it, map.getOrDefault(it, 0) + 1)
            }

            chars.forEachIndexed { index , it ->
                if (map.get(it) == 1) {
                    return index
                }
            }

            return -1
        }
    }
}