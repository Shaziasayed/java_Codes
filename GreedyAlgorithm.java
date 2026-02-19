import java.util.*;

public class GreedyAlgorithm {

    public static void minCoins(int[] coins, int amount) {
        // Sort coins in descending order
        Arrays.sort(coins);

        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {

            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
                System.out.println("Picked coin: " + coins[i]);
            }
        }

        if (amount != 0) {
            System.out.println("Cannot make exact amount with given coins.");
        } else {
            System.out.println("Minimum coins required: " + count);
        }
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 93;

        minCoins(coins, amount);
    }
}
