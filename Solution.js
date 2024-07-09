
/**
 * @param {number[][]} customers
 * @return {number}
 */
var averageWaitingTime = function (customers) {
    let currentTime = 0;
    let sumWaitingTime = 0;

    for (let [timeOfArrival, timeToPrepareTheOrder] of customers) {
        currentTime = Math.max(timeOfArrival, currentTime);
        currentTime += timeToPrepareTheOrder;
        sumWaitingTime += currentTime - timeOfArrival;
    }

    return sumWaitingTime / customers.length;
};
