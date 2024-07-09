
function averageWaitingTime(customers: number[][]): number {
    let currentTime = 0;
    let sumWaitingTime = 0;

    for (let [timeOfArrival, timeToPrepareTheOrder] of customers) {
        currentTime = Math.max(timeOfArrival, currentTime);
        currentTime += timeToPrepareTheOrder;
        sumWaitingTime += currentTime - timeOfArrival;
    }

    return sumWaitingTime / customers.length;
};
