class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        val builder = StringBuilder()
        var startIndex = 0

        s.forEach { cChar ->
            if (startIndex > t.lastIndex) return false

            for (index in startIndex .. t.lastIndex) {
                if (t[index] == cChar) {
                    builder.append(t[index])
                    startIndex = index + 1
                    return@forEach
                } else {
                    if (index == t.lastIndex && builder.toString() != s) {
                        return false
                    } else {
                        //do nothing, continue search
                    }
                }
            }
        }

        return builder.toString() == s
    }
}