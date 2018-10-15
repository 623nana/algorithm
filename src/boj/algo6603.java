package boj;

import java.util.Scanner;

/* 2018-10-15 */

public class algo6603 {
    public static void main(String [] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int[] items;
        int[] bucket;
        while(true){
            int k = scan.nextInt();
            if(k == 0) break;
            items = new int[k];
            bucket = new int[6];
            for(int i = 0; i<items.length; i++){
                items[i] = scan.nextInt();
            }
            solution(items, bucket, 6);
            System.out.println();
        }

    }

    static void solution(int[] items, int[] bucket, int k){
        //다 뽑은 경우
        if(k == 0){
            for(int i : bucket){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        // 처음 뽑는 경우 6-6-1 = -1
        // 두번째 뽑는 경우 6-5-1 = 0 으로 가장 최근에 뽑은 수의 위치는 idx = 0
        int lastIdx = bucket.length - k - 1;

        for(int i = 0; i<items.length; i++){
            if(bucket.length == k){ // 처음뽑는경우
                bucket[0] = items[i];
                solution(items, bucket, k-1);
            } else if( bucket[lastIdx] < items[i]){ //조합으로 가장 마지막 뽑힌 수보다 큰수를 뽑는다
                bucket[lastIdx+1] = items[i];
                solution(items, bucket, k-1);
            }
        }
    }
}
