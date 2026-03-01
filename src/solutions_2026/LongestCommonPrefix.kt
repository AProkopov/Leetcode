package solutions_2026

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var shortestString: String? = null
        val symbols = mutableMapOf<Char, Int>()

        strs.forEach {
            if (shortestString == null || it.length < shortestString!!.length) {
                shortestString = it
            }
        }

        var longestPrefix = ""
        for (i in shortestString!!.indices) {
            strs.forEach { string ->
                symbols.put(string[i], (symbols[string[i]] ?: 0) + 1)
            }

            if (symbols.keys.size > 1) {
                return longestPrefix
            } else {
                longestPrefix += shortestString?.get(i)!!
                symbols.clear()
            }
        }
        return longestPrefix
    }
}