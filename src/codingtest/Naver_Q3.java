package codingtest;
/*
 *
 * 2020-12-31
 * 1~N 까지의 값을 이용하여 K 채우기, 최소한을 이용하여 채워야함
 * 머릿속에 그려지긴 했는데 코드로 구현을 못했음ㅠㅠ
 *
 * */
public class Naver_Q3 {

  public static void main(String[] args) {
    System.out.println(solution(4,10));
    System.out.println(solution(5,8));
    System.out.println(solution(1, 2));
    System.out.println(solution(10, 5));
    System.out.println(solution(50, 100));
    System.out.println(solution(10, 60));

  }
  public static int solution(int N, int K) {
    int minGlass = 0;
    int water = K;

    if( N >= K ) {
      return 1;
    }

    for ( int i = N; i > 0; i--) {
      // 크거나 같을 때만 빼야함
      if (water >= i) {
        water = water - i;
        minGlass++;
      }
      if(water == 0) {
        break;
      }
    }
    return water == 0 ? minGlass : -1;
  }
}
