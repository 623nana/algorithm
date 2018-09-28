package pretest;

import java.io.*;
import java.util.*;

/* 2018-09-28 */

public class nhn_Q1 {
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        //유용..가운데 구분해주는거임..
        StringJoiner rslt = new StringJoiner("\n");

        String[] input = br.readLine().split(" ");

        for(String s : input){
            if(q.size() != 3){
                q.offer(Integer.parseInt(s));
            } else {
                if(q.contains(Integer.parseInt(s))){
                    // 값으로 삭제가 가능한가..? 암튼 된다..
                    q.remove(Integer.parseInt(s));
                    q.offer(Integer.parseInt(s));
                } else {
                    rslt.add(String.valueOf(q.poll()));
                    q.offer(Integer.parseInt(s));
                }
            }
        }

//        for(String s : input){
//            if(list.size() != 3){
//                list.add(Integer.parseInt(s));
//            } else {
//                if(list.contains(Integer.parseInt(s))){
//                    list.remove(Integer.valueOf(Integer.parseInt(s)));
//                    list.add(Integer.parseInt(s));
//                } else {
//                    rslt.add(String.valueOf(list.get(0)));
//                    list.remove(0);
//                    list.add(Integer.parseInt(s));
//                }
//            }
//        }

        System.out.println(rslt.length() == 0 ? 0 : rslt.toString());
    }
}
