package sw;

import java.util.*;

/* 2018-10-17 */

public class sw5658 {
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        int c = 1;
        while(T-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            String str = sc.next();

            int cnt = N / 4;

            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0; i < cnt; i++){
                for(int j = 0; j< 4; j++){
                    // 세개씩 잘라서
                    String tmp = str.substring(j*cnt, (j+1)*cnt);
                    // 없으면 리스트에 추가
                    if(!list.contains(Integer.parseInt(tmp, 16)))
                        list.add(Integer.parseInt(tmp, 16));
                }
                // 자르고 나면 한칸씩 돌리기
                String l = str.substring(N-1, N);
                str = str.substring(0, N-1);
                String newStr = l+str;
                str = newStr;
            }

            Collections.sort(list);
            sb.append("#" + c + " " + list.get(list.size()-K) + "\n");
            c++;
        }
        System.out.print(sb);
    }
}
