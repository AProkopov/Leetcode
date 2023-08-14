object Main {
    @JvmStatic
    fun main(args: Array<String>) {
//        GoogleReceipes.Companion.testFindAllRecipes();
        val testArray = arrayOf("flower","flow","flight")
        LongestCommonPrefix.longestCommonPrefix(testArray)
    }
}