package pretest;

import java.io.*;
import java.util.*;

/* 2018-09-28 */

public class nhn_Q1 {
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 두번째 자리에 있는 수가 들어올 경우 예외 발생하기 때문에 큐 사용 X */
        ArrayList<Integer> list = new ArrayList<>();
        //유용..가운데 구분해주는거임..
        StringJoiner rslt = new StringJoiner("\n");

        String[] input = br.readLine().split(" ");

        for(String s : input){
            if(list.size() != 3){
                list.add(Integer.parseInt(s));
            } else {
                if(list.contains(Integer.parseInt(s))){
                    list.remove(Integer.valueOf(Integer.parseInt(s)));
                    list.add(Integer.parseInt(s));
                } else {
                    rslt.add(String.valueOf(list.get(0)));
                    list.remove(0);
                    list.add(Integer.parseInt(s));
                }
            }
        }

        System.out.println(rslt.length() == 0 ? 0 : rslt.toString());
    }
}
