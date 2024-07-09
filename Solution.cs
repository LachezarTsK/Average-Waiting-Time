
using System;

public class Solution
{
    public double AverageWaitingTime(int[][] customers)
    {
        long currentTime = 0;
        double sumWaitingTime = 0;

        foreach (int[] customer in customers)
        {
            int timeOfArrival = customer[0];
            int timeToPrepareTheOrder = customer[1];

            currentTime = Math.Max(timeOfArrival, currentTime);
            currentTime += timeToPrepareTheOrder;
            sumWaitingTime += currentTime - timeOfArrival;
        }

        return sumWaitingTime / customers.Length;
    }
}
