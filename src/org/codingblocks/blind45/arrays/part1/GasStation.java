package org.codingblocks.blind45.arrays.part1;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(bruteForce(gas, cost));
    }

    public static int bruteForce(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int tank = 0;
            boolean canTravel = true;
            for (int j = 0; j < gas.length; j++) {
                int idx = (i + j) % gas.length;
                tank += gas[idx] - cost[idx];
                if (tank < 0) {
                    canTravel = false;
                    break;
                }

            }
            if (canTravel) {
                return i;
            }
        }
        return -1;
    }
}
