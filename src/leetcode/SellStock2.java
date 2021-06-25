package leetcode;

public class SellStock2 {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {7, 1, 5, 3, 6, 4}));
    System.out.println(solution(new int[] {7, 6, 4, 3, 1}));
    System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
  }

  public static int solution(int[] prices) {

    int maxProfit = 0;
    int len = prices.length;

    for (int i = 0; i < len - 1; i++) {
      if (prices[i] < prices[i + 1]) {
        maxProfit += prices[i + 1] - prices[i];
      }
    }

    return maxProfit;
  }
}
