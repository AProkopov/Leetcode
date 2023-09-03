class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        val initialFlowersCount = flowerbed.count { it == 1 }
        var currentFlowerbed = mutableListOf<Int>().apply { addAll(flowerbed.toList()) }

        flowerbed.forEachIndexed { index, potState ->
            if (potState == 0) {
                if (currentFlowerbed.size == 1) {
                    currentFlowerbed[index] = 1
                } else if (index == 0) {
                    if (currentFlowerbed[index + 1] == 0) {
                        currentFlowerbed[index] = 1
                    }
                } else {
                    if (index == currentFlowerbed.lastIndex) {
                        if (currentFlowerbed[index - 1] == 0) {
                            currentFlowerbed[index] = 1
                        }
                    } else {
                        if (currentFlowerbed[index + 1] == 0 && currentFlowerbed[index - 1] == 0) {
                            currentFlowerbed[index] = 1
                        }
                    }
                }
            } else {
                //do noting
            }
        }

        return currentFlowerbed.count { it == 1 } - initialFlowersCount >= n
    }
}