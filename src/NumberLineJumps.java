public class NumberLineJumps {
  public static void main(String[] args) {
    System.out.println(solution(0, 3, 4, 2));
  }

  public static String solution(int x1, int y1, int x2, int y2) {
    while(true) {
      if(y1 <= y2) return "NO";
      x1 += y1;
      x2 += y2;
      if(x1 == x2) return "YES";
      if(x1 > x2) return "NO";
    }
  }
}
