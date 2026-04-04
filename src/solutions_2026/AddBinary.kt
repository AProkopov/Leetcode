package solutions_2026

fun addBinary(a: String, b: String): String {
    var i = a.lastIndex
    var j = b.lastIndex
    var carry = 0
    val stringBuffer = StringBuffer()

    while (i >= 0 || j >= 0 || carry > 0) {
        val localResult = carry + (if (i >= 0) a[i].digitToInt() else 0) + (if (j >= 0) b[j].digitToInt() else 0)
        i--
        j--

        stringBuffer.append(localResult % 2)
        carry = localResult / 2
    }

    return stringBuffer.reversed().toString()
}

fun addBinarySlow(a: String, b: String): String {
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

    return values.asReversed().joinToString(separator = "") { it.toString() }
}