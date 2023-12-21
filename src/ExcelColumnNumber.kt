import com.sun.org.apache.xalan.internal.lib.ExsltMath.power
import kotlin.math.pow

class ExcelColumnNumber {
    private val startIndex = 'A'.code
    private val alphabetLength = 26

    fun titleToNumberDeprecated(columnTitle: String): Int {

        val array = columnTitle.toCharArray()
        var result = 0

        for (index in array.lastIndex downTo 0) {
            val number = array[index].code - startIndex + 1
            result += (number * (if (index - array.lastIndex != 0) alphabetLength.toDouble().pow(array.lastIndex - index).toInt() else 1))
        }

        return result
    }

    fun titleToNumber(columnTitle: String): Int {
        val array = columnTitle.toCharArray()
        var result = 0

        array.forEachIndexed { index, c ->
            val tmpNum = c.code - startIndex + 1
            result += tmpNum * (alphabetLength.toDouble().pow(array.lastIndex - index).toInt())
        }

        return result
    }

}