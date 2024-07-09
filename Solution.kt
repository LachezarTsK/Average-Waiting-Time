
import kotlin.math.max

class Solution {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var currentTime: Long = 0
        var sumWaitingTime: Double = 0.0

        for ((timeOfArrival, timeToPrepareTheOrder) in customers) {
            currentTime = max(timeOfArrival.toLong(), currentTime)
            currentTime += timeToPrepareTheOrder
            sumWaitingTime += currentTime - timeOfArrival
        }

        return sumWaitingTime / customers.size
    }
}
