package solutions_2026

class ExcelColumnSheetTitle {
    
    fun convertToTitle(columnNumber: Int): String {
        return buildLettersRepresentation(StringBuilder(""), columnNumber)
    }

    fun buildLettersRepresentation(lettersRepresentationBuilder: StringBuilder, number: Int): String {
        val remainder = number % 26
        var quotient = number / 26

        if (remainder != 0) {
            lettersRepresentationBuilder.append('A' + remainder - 1)
        } else {
            lettersRepresentationBuilder.append('Z')
            quotient--
        }

        if (quotient <= 26) {
            if (quotient > 0) lettersRepresentationBuilder.append('A' + quotient - 1)
            return lettersRepresentationBuilder.toString().reversed()
        } else {
            return buildLettersRepresentation(lettersRepresentationBuilder, quotient)
        }
    }

}