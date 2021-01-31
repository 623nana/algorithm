package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

  public static void main(String[] args) {
    System.out.println(solution(new String[] {"I 7", "I 5", "I -5", "D -1"}));
  }

  public static int[] solution(String[] operations) {
    PriorityQueue<Integer> min = new PriorityQueue<>(); // 작은 순서로 뽑는
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder()); // 큰 순서로 뽑
    for (int i = 0; i < operations.length; i++) {
      String[] arr = operations[i].split(" ");
      if(arr[0].equals("I")) {
        min.offer(Integer.parseInt(arr[1]));
        max.offer(Integer.parseInt(arr[1]));
      } else if(arr[0].equals("D") && min.size() != 0){
        if(Integer.parseInt(arr[1]) < 0) { // 최솟값 삭제
          int s = min.poll();
          max.remove(s);
        } else { // 최댓값 삭제
          int l = max.poll();
          min.remove(l);
        }
      } else {
        continue;
      }
    }

    int minNum = min.size() == 0 ? 0 : min.poll();
    int maxNum = max.size() == 0 ? 0 : max.poll();
    return new int[] {maxNum, minNum};
  }

}
