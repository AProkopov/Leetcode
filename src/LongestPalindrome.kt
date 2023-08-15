class LongestPalindrome {

    companion object {
        fun longestPalindrome(s: String): Int {
            if (s.length == 1) return 1

            val sChars = s.toCharArray()
            val charsMap = mutableMapOf<Char, Int>()

            sChars.forEach {
                charsMap.put(it, charsMap.getOrDefault(it, 0) + 1)
            }

            var numberOfNotEvenOccurrences = 0

            charsMap.values.forEach {
                numberOfNotEvenOccurrences += it%2
            }

            return  s.length - (if (numberOfNotEvenOccurrences != 0) (numberOfNotEvenOccurrences - 1) else 0)
        }
    }
}