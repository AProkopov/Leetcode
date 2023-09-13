class RotateString {

    //n^2 solution
    fun rotateString(s: String, goal: String): Boolean {

        if (s.length != goal.length) return false
        if (s == goal) return true

        val sCharArray = s.toCharArray()
        val steps = sCharArray.lastIndex - 1

        for (i in 0 .. steps) {
            val rightElementTmp = sCharArray.last()

            for (j in sCharArray.lastIndex downTo 1) {
                sCharArray[j] = sCharArray[j - 1]
            }

            sCharArray[0] = rightElementTmp

            if (sCharArray.concatToString() == goal) return true
        }

        return false
    }
}