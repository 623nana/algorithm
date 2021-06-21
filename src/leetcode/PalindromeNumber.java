package leetcode;

public class PalindromeNumber {

  public static void main(String[] args) {
    System.out.println(solution(1221));
    System.out.println(solution(100));
    System.out.println(solution(1));
  }

  public static boolean solution(int x) {
    if (x < 0) {
      return false;
    }

    boolean answer = true;
    String[] nums = String.valueOf(x).split("");
    int len = nums.length;
    int lastIdx = len % 2 == 0 ? len / 2 : (len / 2) + 1;

    for (int i = 0; i < lastIdx; i++) {
      int val = x % 10;
      if (Integer.parseInt(nums[i]) != val) {
        answer = false;
        break;
      } else {
        x = x / 10;
      }
    }

    return answer;
  }

}
