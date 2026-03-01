package solutions_2026

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var shortestString: String? = null

        strs.forEach {
            if (shortestString == null || it.length < shortestString!!.length) {
                shortestString = it
            }
        }

        var longestPrefix = ""
        for (i in shortestString!!.indices) {
            val expectedSymbol = shortestString!![i]
            strs.forEach { string ->
                if (string[i] != expectedSymbol) return longestPrefix
            }
            longestPrefix += expectedSymbol
        }

        return longestPrefix
    }
}