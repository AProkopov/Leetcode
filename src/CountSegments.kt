class CountSegments {

    companion object {
        fun countSegmentsSlow(s: String): Int {
            val trimmedString = s.trim()
            if (trimmedString.isEmpty()) return 0
            return trimmedString.split("\\s+".toRegex()).size
        }

        fun countSegments(s: String): Int {
            var count = 0
            var last = ' '

            "$s ".forEach {
                if (last != ' ' && it == ' ') {
                    count++
                }

                last = it
            }

            return count
        }
    }
}