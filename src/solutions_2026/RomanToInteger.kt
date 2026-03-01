package solutions_2026

fun romanToIntSlowSolution(s: String): Int {
    var pointer = -1
    var result = 0

    s.forEachIndexed { index, c ->
        when {
            index <= pointer -> {
                // do nothing
            }

            index != s.lastIndex && exclusions.containsKey(s.get(index).toString() + s.get(index + 1).toString()) -> {
                result += exclusions[s.get(index).toString() + s.get(index + 1).toString()]!!
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

fun romanToInt(s: String): Int {
    var result = 0

    for (i in s.indices) {
        val current = numbersMap[s[i].toString()]!!

        if (i == s.lastIndex) {
            result += current
            break
        }

        val next = numbersMap[s[i + 1].toString()]!!

        if (current < next) {
            result -= current
        } else {
            result += current
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