package solutions_2026

fun romanToInt(s: String): Int {
    var pointer = -1
    var result = 0
    val romanInput = s.toCharArray()

    romanInput.forEachIndexed { index, c ->
        when {
            index <= pointer -> {
                // do nothing
            }

            index != romanInput.lastIndex && exclusions.containsKey(romanInput.get(index).toString() + romanInput.get(index + 1).toString()) -> {
                result += exclusions[romanInput.get(index).toString() + romanInput.get(index + 1).toString()]!!
                pointer = index + 1
            }

            else -> {
                result += numbersMap[c.toString()]!!
                pointer = index
            }
        }
    }

    return result
}

val numbersMap: Map<String, Int> = mapOf<String, Int>(
    "I" to 1,
    "V" to 5,
    "X" to 10,
    "L" to 50,
    "C" to 100,
    "D" to 500,
    "M" to 1000,
)

val exclusions = mapOf<String, Int>(
    "IV" to 4,
    "IX" to 9,
    "XL" to 40,
    "XC" to 90,
    "CD" to 400,
    "CM" to 900,
)