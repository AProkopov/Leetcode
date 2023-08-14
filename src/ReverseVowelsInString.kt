class ReverseVowelsInString {

    companion object {
        fun reverseVowels(s: String): String {

            val vowels = charArrayOf('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U')
            val chars = s.toCharArray()

            if (chars.size <= 1) return s

            var leftIndex = 0
            var rightIndex = chars.lastIndex

            while (leftIndex < rightIndex) {
                while (leftIndex < rightIndex && chars[leftIndex] !in vowels) leftIndex++
                while (leftIndex < rightIndex && chars[rightIndex] !in vowels) rightIndex--

                if (leftIndex < rightIndex) {
                    chars[leftIndex] = chars[rightIndex].also { chars[rightIndex] = chars[leftIndex] }
                    leftIndex++
                    rightIndex--
                }
            }


            return String(chars)
        }
    }
}