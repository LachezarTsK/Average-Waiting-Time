
package main

import "fmt"

func averageWaitingTime(customers [][]int) float64 {
    var currentTime int64 = 0
    var sumWaitingTime float64 = 0.0

    for _, customer := range customers {
        timeOfArrival := customer[0]
        timeToPrepareTheOrder := customer[1]

        currentTime = max(int64(timeOfArrival), currentTime)
        currentTime += int64(timeToPrepareTheOrder)
        sumWaitingTime += float64(currentTime - int64(timeOfArrival))
    }

    return sumWaitingTime / float64(len(customers))
}
