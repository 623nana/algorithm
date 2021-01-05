package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Nlcm {

  public static void main(String[] args) {
    /*
    * a, b, c, d 가 존재한다면
    * a와 b의 최소 공배수 l
    * 그다음 l과 c의 최소공배수로 l 업데이트
    * 배열이 끝날 때까지
    * */
    System.out.println(solution(new int[] {2, 6, 8, 14}));
    System.out.println(solution(new int[] {1, 2, 3}));
    System.out.println(solution(new int[] {1, 1, 1, 1}));
    System.out.println(solution(new int[] {3, 4, 9, 16}));
  }

  public static int solution(int[] arr) {
    int answer = 0;

    if(arr.length == 1) {
      return arr[0];
    }
    Queue<Integer> queue = new LinkedList<>();

    for(int i : arr) {
      queue.offer(i);
    }

    // 최초 a와 b의 최소 공배수
    int a = queue.poll();
    int b = queue.poll();
    int lcm = (a * b) / getGCD(a, b);


    while(true) {
      if (queue.size() == 0) {
        answer = lcm;
        break;
      }
      int c = queue.poll();
      lcm = (c * lcm) / getGCD(lcm, c);
    }

    return answer;
  }

  public static int getGCD(int a, int b) {
    if(b == 0) return a;
    return getGCD(b, a % b);
  }

}
