class LengthOfLastWord {
    companion object {
        private var length = 0
        fun lengthOfLastWord(s: String): Int {
            var foundFirstSymbol = false

            for (index in s.lastIndex downTo 0) {
                if (s[index] != ' ') {
                    foundFirstSymbol = true
                    length++

                } else {
                    if (foundFirstSymbol) {
                        return length
                    }
                }
            }


            return length
        }
    }
}