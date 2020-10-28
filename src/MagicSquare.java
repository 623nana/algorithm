import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/* 2020-10-28 */

public class MagicSquare {

  // Complete the formingMagicSquare function below.
  static int formingMagicSquare(int[][] s) {
    int[] sum = new int[8];
    int min = 1000;

    // 3*3에서 나올 수 있는 경우의 수 8가지 그냥 단순 비교,,
    int[][] arr1 = new int[][] {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
    int[][] arr2 = new int[][] {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
    int[][] arr3 = new int[][] {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
    int[][] arr4 = new int[][] {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
    int[][] arr5 = new int[][] {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
    int[][] arr6 = new int[][] {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    int[][] arr7 = new int[][] {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
    int[][] arr8 = new int[][] {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};

    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        sum[0] += Math.abs(s[i][j] - arr1[i][j]);
        sum[1] += Math.abs(s[i][j] - arr2[i][j]);
        sum[2] += Math.abs(s[i][j] - arr3[i][j]);
        sum[3] += Math.abs(s[i][j] - arr4[i][j]);
        sum[4] += Math.abs(s[i][j] - arr5[i][j]);
        sum[5] += Math.abs(s[i][j] - arr6[i][j]);
        sum[6] += Math.abs(s[i][j] - arr7[i][j]);
        sum[7] += Math.abs(s[i][j] - arr8[i][j]);
      }
    }

    for(int i = 0; i<sum.length; i++) {
      min = min > sum[i] ? sum[i] : min;
  }

    return min;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int[][] s = new int[3][3];

    for (int i = 0; i < 3; i++) {
      String[] sRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int j = 0; j < 3; j++) {
        int sItem = Integer.parseInt(sRowItems[j]);
        s[i][j] = sItem;
      }
    }

    int result = formingMagicSquare(s);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
