package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class WorksPow {

  public static void main(String[] args) {
    solution(new int[]{1, 1}, 3);
  }

  public static long solution(int[] works, int n) {
    long answer = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 내림 차순

    for (int num : works) {
      pq.offer(num);
    }

    while (n > 0) {
      if (pq.peek() == 0) {
        break;
      }
      int tmp = pq.poll() - 1;
      pq.offer(tmp);
      n--;
    }
    // while 이랑 차이가 뭘까...?
    int len = pq.size();
    for (int i = 0; i < len; i++) {
      int t = pq.poll();
      answer += Math.pow(t, 2);
    }

    return answer;
  }
}
