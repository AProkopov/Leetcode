import java.lang.StringBuilder

class AddStrings {
    fun addStrings(num1: String, num2: String): String {
        var i = num1.lastIndex
        var j = num2.lastIndex
        var carry = 0
        val stringBuilder = StringBuilder()

        while (i >= 0 || j >= 0 || carry > 0) {
            var sum: Int = 0
            if (i >= 0) sum += num1[i] - '0'
            if (j >= 0) sum += num2[j] - '0'
            sum += carry

            stringBuilder.append(sum % 10)
            carry = sum / 10

            i--
            j--
        }


        return stringBuilder.reversed().toString()
    }
}