class RansomNote {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineLettersMap = mutableMapOf<Char, Int>()

        magazine.forEach {
            magazineLettersMap.put(it, magazineLettersMap.getOrDefault(it, 0) + 1)
        }

        ransomNote.toCharArray().forEach {
            val value = magazineLettersMap.getOrDefault(it, 0)
            if (value == 0) {
                return false
            } else {
                magazineLettersMap.put(it, magazineLettersMap.get(it)!! - 1)
            }
        }

        return true
    }

}