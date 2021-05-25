package leetcode;

public class MaximumSubarray {

  public static void main(String[] args) {
    System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
  }

  public static int maxSubArray(int[] nums) {
    int maxSum = 0;
    int endMax = Integer.MIN_VALUE;
    // 카데인 알고리즘, 최대 부분합
    for (int i = -1; i < nums.length - 1; i++) {
      maxSum = Math.max(maxSum + nums[i + 1], nums[i + 1]);
      endMax = Math.max(maxSum, endMax);
    }

    return endMax;
  }

}
