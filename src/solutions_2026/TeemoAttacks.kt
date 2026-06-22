package solutions_2026

class TeemoAttacks {
    fun findPoisonedDurationStraightForward(timeSeries: IntArray, duration: Int): Int {
        if (timeSeries.isEmpty()) return 0

        var poisonedTime = 0

        timeSeries.forEachIndexed { index, time ->
            poisonedTime += if (index == timeSeries.lastIndex) {
                duration
            } else if (duration > timeSeries[index + 1] - time) {
                timeSeries[index + 1] - time
            } else {
                duration
            }
        }

        return poisonedTime
    }

    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        if (timeSeries.isEmpty()) return 0

        var poisonedTime = 0

        for (i in 0 until timeSeries.lastIndex) {
            poisonedTime += minOf(duration, timeSeries[i + 1] - timeSeries[i])
        }
        return poisonedTime + duration
    }
}