import java.util.List;

public class BetweenTwoSets {

  public static void main(String[] args) {
    System.out.println(lcm(2, 5));
  }


  public static int getTotalX(List<Integer> a, List<Integer> b) {
    int lcm = lcm(a);
    int gcd = gcd(b);

    int cnt = 0;
    int s = 0;
    int idx = 1;

    while(s < gcd) {
      s = lcm * idx;
      if(gcd % s == 0)
        cnt++;

      idx++;
    }
    return cnt;
  }

  // 리스트의 최대 공약
  public static int gcd(List<Integer> g) {
    int r = g.get(0);
    for (int i = 1; i < g.size(); i++) {
      r = gcd(r, g.get(i));
    }
    return r;
  }

  // 두 수의 최대 공약수
  public static int gcd(int x, int y) {
    while (y > 0) {
      int tmp = y;
      y = x % y;
      x = tmp;
    }
    return x;
  }

  // 리스트의 최소 공배수
  public static int lcm(List<Integer> l) {
    int r = l.get(0);
    for(int i = 1; i<l.size(); i++) {
      r = lcm(r, l.get(i));
    }
    return r;
  }

  // 두 수의 최소 공배수
  public static int lcm(int x, int y) {
    // 최소 공배수 = 두 수의 곱 / 최대 공약수
    return ( x * y ) / gcd(x, y);
  }
}