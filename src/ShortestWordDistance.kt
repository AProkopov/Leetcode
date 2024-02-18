import java.lang.Integer.min

class ShortestWordDistance {

    private var positionWord1 = -1
    private var positionWord2 = -1

    private val positiveDiff: Int
        get() = if (positionWord1 - positionWord2 > 0) positionWord1 - positionWord2 else positionWord2 - positionWord1

    fun shortestDistance(wordsDict: Array<String>, word1: String, word2: String): Int {

        var distance = -1

        wordsDict.forEachIndexed { index, word ->
            if (word == word1) positionWord1 = index
            if (word == word2) positionWord2 = index

            if (positionWord1 != -1 && positionWord2 != -1 && distance > 0) {
                distance = min(distance, positiveDiff)
            }

            if (positionWord1 != -1 && positionWord2 != -1 && distance == -1) {
                distance = positiveDiff
            }
        }


        return distance
    }

}