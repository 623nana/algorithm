package leetcode;

public class SellStock {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {7, 1, 5, 3, 6, 4}));
    System.out.println(solution(new int[] {7, 6, 4, 3, 1}));
  }

  public static int solution(int[] prices) {

    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    int len = prices.length;

    for (int i = 0; i < len; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - minPrice);
    }

    return maxProfit;
  }

}
