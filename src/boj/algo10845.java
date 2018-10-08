package boj;
/* 2018-09-04 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class algo10845 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0 ; i < n; i++){
            String str = scan.nextLine();
            String[] input = str.split(" ");
            switch (input[0]){
                case "push":
                    q.add(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    System.out.println(q.isEmpty() ? -1 : q.poll());
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    System.out.println(q.isEmpty()? 1 : 0);
                    break;
                case "front":
                    System.out.println(q.isEmpty()? "-1" : ((LinkedList<Integer>) q).getFirst());
                    break;
                case "back":
                    System.out.println(q.isEmpty()? "-1" : ((LinkedList<Integer>) q).getLast());
                    break;
            }
        }
    }
}
