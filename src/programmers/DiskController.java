package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DiskController {

  public static void main(String[] args) {
    System.out.println(solution(new int[][]{{10, 10},{30, 10}, {50, 2}, {51,2}}));
  }

  public static int solution(int[][] jobs) {
    PriorityQueue<Job> pq = new PriorityQueue<>();

    // 시간 적게 걸리는 것 부터 일단 넣기..
    for (int i = 0; i < jobs.length; i++) {
      pq.offer(new Job(jobs[i][0], jobs[i][1]));
    }

    List<Job> job = new ArrayList<>();
    for (int i = 0; i < jobs.length; i++) {
      job.add(pq.poll());
    }
    int time = 0;
    int total = 0;
    while (job.size() > 0) {
      // 현재 시간 보다 작거나 같으면 수행 가능..
      // 시작 시간 가장 빠른 것, 시간이 적게 걸리는 것 부터 수행
      for (int i = 0; i < job.size(); i++) {
        if (time >= job.get(i).start) {
          time += job.get(i).end;
          total += time - job.get(i).start;
          job.remove(i);
          break;
        }
        // 실행 가능한 것이 없으면 시간 증가
        if (i == job.size() - 1) {
          time++;
        }
      }
    }
    return total / jobs.length;
  }
}

class Job implements Comparable<Job> {

  int start;
  int end;

  Job(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public int compareTo(Job o) {
    if (this.end > o.end) {
      return 1;
    } else if (this.end < o.end) {
      return -1;
    }
    return 0;
  }
}
