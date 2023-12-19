class KeyboardRow {
    private val row1 = "qwertyuiop".toSet() + "qwertyuiop".uppercase().toSet()
    private val row2 = "asdfghjkl".toSet() + "asdfghjkl".uppercase().toSet()
    private val row3 = "zxcvbnm".toSet() + "zxcvbnm".uppercase().toSet()

    fun findWords(words: Array<String>): Array<String> {
        val resultArray = mutableListOf<String>()

        words.forEach { word ->
            if (row1.containsAll(word.toSet()) || row2.containsAll(word.toSet()) || row3.containsAll(word.toSet())) {
                resultArray.add(word)
            }
        }

        return resultArray.toTypedArray()
    }
}