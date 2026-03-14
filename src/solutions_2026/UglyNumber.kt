package solutions_2026

class UglyNumber {

    fun isUgly(n: Int): Boolean {
        if (n <= 0) return false

        val factors = listOf(2, 3, 5)

        var number = n

        for (factor in factors) {
            while (number % factor == 0) {
                number = number / factor
            }
        }

        return number == 1
    }
}