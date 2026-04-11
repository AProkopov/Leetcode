package solutions_2026

class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
        for(i in digits.lastIndex downTo 0) {
            if (digits[i] == 9) {
                digits[i] = 0
            } else {
                digits[i] = digits[i] + 1
                return digits
            }
        }

        return IntArray(digits.size + 1).also { it[0] = 1 }
    }


    fun plusOneBitComplexSolution(digits: IntArray): IntArray {
        var carry = 1
        var initialEntry = true
        var index = digits.lastIndex
        var extendedDigits: IntArray? = null

        while (carry != 0 || initialEntry) {
            initialEntry = false

            if (index == 0 && digits[index] + carry > 9) {
                extendedDigits = IntArray(1)
                extendedDigits[0] = 1
                digits[0] = 0
                extendedDigits[0] = 1
                return extendedDigits + digits
            }

            if (digits[index] + carry > 9) {
                digits[index] = 0
                index --
            } else {
                digits[index] = digits[index] + 1
                carry = 0
            }
        }

        return digits
    }
}