class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val result = mutableListOf<String>()

        for (number in 1 .. n) {
            result.add(when {
                number % 15 == 0 -> "FizzBuzz"
                number % 3 == 0 -> "Fizz"
                number % 5 == 0 -> "Buzz"
                else -> number.toString()
            }
            )

        }

        return result
    }
}