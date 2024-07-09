
#include <vector>
#include <algorithm>
using namespace std;

class Solution {

public:
    double averageWaitingTime(const vector<vector<int>>& customers) const {
        long long currentTime = 0;
        double sumWaitingTime = 0;

        for (const auto& customer : customers) {
            int timeOfArrival = customer[0];
            int timeToPrepareTheOrder = customer[1];

            currentTime = max(static_cast<long long>(timeOfArrival), currentTime);
            currentTime += timeToPrepareTheOrder;
            sumWaitingTime += currentTime - timeOfArrival;
        }

        return sumWaitingTime / customers.size();
    }
};
