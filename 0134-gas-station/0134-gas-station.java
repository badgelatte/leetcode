class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;

        int current = 0;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] == cost[i]) {
                continue;
            }
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                currentGas = 0;
                current = i + 1;

            }
        }

        if (totalGas >= totalCost) {
            return current;
        }

        return -1;
    }
}