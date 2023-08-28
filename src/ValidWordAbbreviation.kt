class ValidWordAbbreviation {
    //todo! not solved (some edge cases doesn't work)
    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        //here we need to transform abbr to List<String>
        val numChars = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',)
        val tmpNumCharArray = mutableListOf<Char>()
        val abbrByStringList = mutableListOf<String>()

        abbr.forEachIndexed { index, c ->

            if (c in numChars) {
                tmpNumCharArray.add(c)
            } else {
                if (tmpNumCharArray.isNotEmpty()) {
                    abbrByStringList.add(tmpNumCharArray.joinToString(separator = ""))
                    tmpNumCharArray.clear()
                }

                abbrByStringList.add(c.toString())
            }
        }

        if (tmpNumCharArray.isNotEmpty()) {
            abbrByStringList.add(tmpNumCharArray.joinToString(separator = ""))
            tmpNumCharArray.clear()
        }

        var usedNumbersSum = 0
        var indexesWithNumbers = 0
        abbrByStringList.forEachIndexed { index, s ->
            if (s.toIntOrNull() == null) {
                if (s != word[index + usedNumbersSum - indexesWithNumbers].toString()) {
                    return false
                }
            } else {
                usedNumbersSum += s.toInt()
                indexesWithNumbers++
            }
        }

        return true
    }
}