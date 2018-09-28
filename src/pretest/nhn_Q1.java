package pretest;

import java.io.*;
import java.util.*;

public class nhn_Q1 {
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<Integer>();
        String[] input = br.readLine().split(" ");

        //int[] input = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int cnt = 0;
        for(int i = 0; i<input.length; i++){
            if(q.size() != 3){
                q.offer(Integer.parseInt(input[i]));
            } else {
                if(q.peek() == Integer.parseInt(input[i])){
                    q.poll();
                    q.offer(Integer.parseInt(input[i]));
                } else {
                    cnt++;
                    System.out.print(q.poll() + "\n");
                    q.offer(Integer.parseInt(input[i]));
                }
            }
        }
        if(cnt == 0){
            System.out.print(0);
        }
    }
}
