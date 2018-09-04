
/* 2018-09-04 */

import java.util.Scanner;
import java.util.Stack;

public class algo10828 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0 ; i < n; i++){
            String str = scan.nextLine();

            String[] input = str.split(" ");
            switch (input[0]){
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;

                case "pop":
                    System.out.println(stack.isEmpty() ? "-1" : stack.pop());
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0 );
                    break;

                case "top":
                    System.out.println(stack.isEmpty() ? "-1" : stack.peek());
                    break;
            }
        }

    }
}
