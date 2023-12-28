class LicenseKeyFormatting {

    fun licenseKeyFormatting(s: String, k: Int): String {
        val charList = s.toCharArray()
        val formattedCharList = mutableListOf<Char>()
        var currentSegmentLength = 0

        for (i in charList.lastIndex downTo 0) {
            if (charList[i] == '-') {
                continue
            }

            if (currentSegmentLength == 0 && i != charList.lastIndex) {
                formattedCharList.add('-')
            }

            formattedCharList.add(charList[i].uppercaseChar())

            currentSegmentLength++
            if (currentSegmentLength == k) {
                currentSegmentLength = 0
            }

        }

        return formattedCharList.joinToString("").reversed()
    }
}