package hackerrank;

public class ReverseInteger {

  public static void main(String[] args) {
    System.out.println(solution(1534236469));
  }

  public static int solution(int x) {
    StringBuilder sb = new StringBuilder();

    int len = String.valueOf(x).length();
    if (len == 1) {
      return x;
    }

    if (String.valueOf(x).charAt(len - 1) == '0') {
      x = Integer.parseInt(String.valueOf(x).substring(0, len - 1));
    }

    int end = 0;
    String[] num = String.valueOf(x).split("");
    if (x < 0) {
      sb.append(num[0]);
      end = 1;
    }

    for (int i = num.length - 1; i >= end; i--) {
      sb.append(num[i]);
    }

    long result = Long.parseLong(sb.toString());

    if (result < Integer.MIN_VALUE + 1 || result > Integer.MAX_VALUE - 1) {
      return 0;
    }
    return (int) result;
  }
}
