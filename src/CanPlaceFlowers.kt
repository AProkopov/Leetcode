class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var index = 0
        var flowers = n

        while (index <= flowerbed.lastIndex) {
            if (flowerbed[index] == 0) {
                val left = if (index == 0) 0 else flowerbed[index - 1]
                val right = if (index == flowerbed.lastIndex) 0 else flowerbed[index + 1]

                if (left == 0 && right == 0) {
                    flowerbed[index] = 1
                    flowers--
                }
            }

            index++
        }

        return flowers <= 0
    }
}