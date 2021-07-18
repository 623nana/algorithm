package codility;

public class DivideSearch {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 2, 5, 9, 9}, 5));
  }

  public static int solution(int[] A, int X) {
    int len = A.length;
    if (len == 0) {
      return -1;
    }

    int left = 0;
    int right = len - 1;

    int mid = (left + right) / 2;

    while (left <= right) {
      if (A[mid] > X) {
        right = mid - 1;
      } else if (A[mid] < X) {
        left = mid + 1;
      } else {
        return mid;
      }
    }

    return -1;
  }

}
