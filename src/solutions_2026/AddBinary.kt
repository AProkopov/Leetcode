package solutions_2026

fun addBinary(a: String, b: String): String {
    val rawResult = (a.toBigDecimal() + b.toBigDecimal()).toString()

    val values = mutableListOf<Int>()
    var move = 0

    for (i in rawResult.lastIndex downTo 0) {
        when {
            (rawResult[i].digitToInt() + move == 0) || (rawResult[i].digitToInt() + move == 1) -> {
                values.add(rawResult[i].digitToInt() + move)
                move = 0
            }

            rawResult[i].digitToInt() == 2 -> {
                values.add(move)
                move = 1
            }

            else -> {
                values.add(0)
                move = 1
            }
        }
    }

    if (move != 0) {
        values.add(move)
    }

return values.reversed().joinToString { it.toString() }.replace(", ", "")
}