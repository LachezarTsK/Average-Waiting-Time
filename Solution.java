
public class Solution {

    public double averageWaitingTime(int[][] customers) {
        long currentTime = 0;
        double sumWaitingTime = 0;

        for (int[] customer : customers) {
            int timeOfArrival = customer[0];
            int timeToPrepareTheOrder = customer[1];

            currentTime = Math.max(timeOfArrival, currentTime);
            currentTime += timeToPrepareTheOrder;
            sumWaitingTime += currentTime - timeOfArrival;
        }

        return sumWaitingTime / customers.length;
    }
}
