package solutions_2026

import java.util.*

class ValidParentheses {

    private val stack = Stack<Char>()

    fun isValid(s: String): Boolean {
        s.forEach {
            if (stack.isEmpty() && isClosingParenthesis(it)) {
                return false
            } else if (isClosingParenthesis(it)) {
                val lastElement = stack.lastElement()
                if (lastElement == getOpeningParenthesis(it)!!) {
                    stack.pop()
                } else {
                    return false
                }
            } else {
                stack.add(it)
            }
        }
        return stack.isEmpty()
    }

    private fun getOpeningParenthesis(opening: Char): Char? {
        return when(opening) {
            ')' -> '('
            '}' -> '{'
            ']' -> '['
            else -> null
        }
    }

    private fun isClosingParenthesis(char: Char): Boolean {
        return when(char) {
            ')', '}', ']' -> true
            else -> false
        }
    }
}