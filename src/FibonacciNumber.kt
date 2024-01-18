class FibonacciNumber {

    fun fib(n: Int): Int {
        var nMinus2 = 0
        var nMinus1 = 1
        var result = 0

        if (n == 0) return 0
        if (n == 1) return 1

        for (i in 2 .. n) {
            result = nMinus1 + nMinus2

            nMinus2 = nMinus1
            nMinus1 = result
        }

        return result
    }

}