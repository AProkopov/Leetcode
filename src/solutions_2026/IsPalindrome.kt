package solutions_2026

class IsPalindrome {
    fun isPalindrome(x: Int): Boolean {
        x.toString().toCharArray().let {
            it.forEachIndexed { index, c ->
                if (it.size == 1) return true
                if (index == it.lastIndex - index) return true
                if (it[index] != it[it.lastIndex - index]) return false
            }
        }

        return true
    }
}