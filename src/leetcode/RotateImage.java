package leetcode;

public class RotateImage {

  public static void solution(int[][] matrix) {
    int[][] copy = deepCopy(matrix);

    int len = matrix.length;

    for (int x = 0; x < len; x++) {
      for (int y = 0; y < len; y++) {
        matrix[x][y] = copy[len - y - 1][x];
      }
    }
  }

  public static int[][] deepCopy(int[][] origin) {
    if (origin == null) {
      return null;
    }

    int[][] result = new int[origin.length][origin[0].length];

    for (int i = 0; i < origin.length; i++) {
      System.arraycopy(origin[i], 0, result[i], 0, origin[0].length);
    }
    return result;
  }
}
