class GoogleReceipes {

    companion object {
        private val renewedSupplies = mutableListOf<String>()


        private var thereIsStillSomethingToCheck = true
        private val testRecepies = listOf("ju","fzjnm","x","e","zpmcz","h","q")
        private val testIngredients = listOf(
            listOf("d"),
            listOf("hveml","f","cpivl"),
            listOf("cpivl","zpmcz","h","e","fzjnm","ju"),
            listOf("cpivl","hveml","zpmcz","ju","h"),
            listOf("h","fzjnm","e","q","x"),
            listOf("d","hveml","cpivl","q","zpmcz","ju","e","x"),
            listOf("f","hveml","cpivl")
        )
        private val testSupplies = listOf("f","hveml","cpivl","d")

        fun testFindAllRecipes() {
            findAllRecipes(testRecepies.toTypedArray(), testIngredients, testSupplies.toTypedArray())
        }

        fun findAllRecipes(recipes: Array<String>, ingredients: List<List<String>>, supplies: Array<String>): List<String> {
            val resultList = mutableListOf<String>()

            renewedSupplies.addAll(supplies)

            while (thereIsStillSomethingToCheck) {
                thereIsStillSomethingToCheck = false
                recipes.forEachIndexed { index, product ->
                    var productCanBeCookedSimply = true

                    ingredients[index].forEach {
                        if (!renewedSupplies.contains(it))  { productCanBeCookedSimply = false }
                    }

                    if (!resultList.contains(product) && productCanBeCookedSimply) {
                        resultList.add(product)
                        renewedSupplies.add(product)
                        thereIsStillSomethingToCheck = true
                    } else {
                        thereIsStillSomethingToCheck = false
                    }
                }
            }

            return resultList
        }
    }
}