
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class shivam {
    public static void main(String[] args) {
        Integer[] Coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        Arrays.sort(Coins, Comparator.reverseOrder());

        int CountofCoins = 0;
        int Amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < Coins.length; i++) {
            if (Coins[i] <= Amount) {
                while (Coins[i] <= Amount) {
                    CountofCoins++;
                    ans.add(Coins[i]);
                    Amount -= Coins[i];
                }
            }
        }

        System.out.println("Count of Coins: " + CountofCoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
    