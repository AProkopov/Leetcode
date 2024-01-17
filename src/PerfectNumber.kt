class PerfectNumber {

    private var devisorsSum = 0

    fun checkPerfectNumber(num: Int): Boolean {
        for (i in 1 until num) {
            if (num % i == 0) {
                devisorsSum += i
            }

            if (devisorsSum > num) {
                return false
            }
        }

        return devisorsSum == num
    }

}