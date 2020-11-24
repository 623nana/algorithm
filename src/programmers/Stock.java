package programmers;

public class Stock {
  public static void main(String[] args) {
    solution(new int[] {1, 2, 3, 2, 3});
  }

  public static int[] solution(int[] prices) {
    int[] answer = new int[prices.length];

    int pricesLen = prices.length;

    // 배열을 돌면서 자기보다 값이 작은 시점을 찾는
    for(int i = 0; i < pricesLen; i++) {
      for(int j = i; j < pricesLen; j++) {
        if(prices[i] > prices[j]) {
          answer[i] = j - i;
          break;
        } else {
          answer[i] = j - i;
        }
      }
    }

    return answer;
  }

}
