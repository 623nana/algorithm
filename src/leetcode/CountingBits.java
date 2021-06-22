package leetcode;

public class CountingBits {

  public static void main(String[] args) {
    solution(5);
  }

  public static int[] solution(int n) {
    int[] answer = new int[n + 1];

    for(int i = 0; i <= n; i++) {
      String[] bits = Integer.toBinaryString(i).split("");
      for (String bit : bits) {
        answer[i] += Integer.parseInt(bit);
      }
    }

    return answer;
  }

}
