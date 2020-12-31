package codingtest;
/*
*
* 2020-12-31
* 자릿수가 같은 최소의 값 찾기
*
* */
public class Naver_Q1 {

  public static void main(String[] args) {
    System.out.println(solution(100000000));
  }
  public static int solution (int N) {
    int answer = 1;

//    int len = (int) Math.log10(N) + 1;
    int len = String.valueOf(N).length();
    if(len == 1) return 0;
    for(int i = 0 ; i < len - 1; i++) {
      answer *= 10;
    }

    return answer;
  }

}
