package codility;

import java.util.ArrayList;

public class BinaryGap {
    public static void main(String [] args) throws Exception {
        System.out.println(solution(1041));
    }

    public static int solution(int N) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] arr = Integer.toBinaryString(N).split("");
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("1")){
                list.add(i);
            }
        }

        int m = 0;

        for(int i = 1; i<list.size(); i++){
            int tmp = list.get(i) - list.get(i-1) -1;
            m = tmp > m ? tmp : m;

        }

        return m;
    }
}
