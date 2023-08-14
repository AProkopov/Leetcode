import java.lang.StringBuilder

class LongestCommonPrefix {

    companion object {
        fun longestCommonPrefix(strs: Array<String>): String {
            var minimalLengthIndex: Int = 0
            var minimalLength: Int = 0
            val stringBuilder = StringBuilder()

            strs.forEachIndexed { index, s ->
                if (index == 0) {
                    minimalLength = s.length
                    minimalLengthIndex = index
                } else {
                    if (s.length < minimalLength) {
                        minimalLength = s.length
                        minimalLengthIndex = index
                    }
                }
            }

            val shortestString = strs[minimalLengthIndex]

            shortestString.forEachIndexed { index, c ->
                var isCommonPrefix = true
                strs.forEach {
                    if (!it.startsWith(shortestString.substring(0, index + 1))) isCommonPrefix = false
                    if (!isCommonPrefix) return stringBuilder.toString()
                }

                stringBuilder.append(c)
            }

            return stringBuilder.toString()

        }
    }

}