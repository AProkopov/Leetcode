class FindTheDifference {
    fun findTheDifference(s: String, t: String): Char {
        val charsMap = mutableMapOf<Char, Int>()

        s.forEach {
            charsMap.put(it, charsMap.getOrDefault(it, 0) + 1)
        }

        t.forEach {
            charsMap.put(it, charsMap.getOrDefault(it, 0) - 1)
        }

        return charsMap.filter { it.value < 0 }.keys.first()
    }

    fun findTheDifferenceWithArrays(s: String, t: String): Char {
        val sList = s.toList().sorted()
        val tList = t.toList().sorted()

        for (index in 0 .. tList.lastIndex) {
            if (index > sList.lastIndex || sList[index] != tList[index]) {
                return tList[index]
            }
        }

        return ' ' //should never get here
    }
}