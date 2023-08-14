class ReverseString {

    companion object {
        fun reverseString(s: CharArray): Unit {
            val arrayLength = s.size
            val centralIndex = s.lastIndex / 2

            if (arrayLength <= 1) return

            for (index in 0 .. centralIndex) {
                val tmpRightEdgeElement = s[s.lastIndex - index]
                s[s.lastIndex - index] = s[index]
                s[index] = tmpRightEdgeElement
            }

        }

    }
}