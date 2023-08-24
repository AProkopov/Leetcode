import java.lang.StringBuilder

class AddStrings {
    fun addStrings(num1: String, num2: String): String {
        val smaller: String
        val bigger: String
        val stringBuilder = StringBuilder()

        if (num1.length > num2.length) {
            smaller = num2
            bigger = num1
        } else {
            smaller = num1
            bigger = num2
        }

        var smallerIndex = smaller.lastIndex
        var transition = 0

        for (index in bigger.lastIndex downTo 0) {
            var directSumResult = bigger[index].toString().toInt() + (if (smallerIndex >= 0) smaller[smallerIndex].toString().toInt() else 0) + transition
            smallerIndex--
            val sumToWrite: Int

            if (directSumResult > 9) {
                sumToWrite = directSumResult - 10
                if (sumToWrite > 9) directSumResult - 20
                transition = directSumResult / 10
            } else {
                sumToWrite = directSumResult
                transition = 0
            }

            stringBuilder.append(sumToWrite)
        }

        if (transition != 0) {
            stringBuilder.append(transition)
        }



        val result = stringBuilder.toString().reversed()

        return result
    }
}