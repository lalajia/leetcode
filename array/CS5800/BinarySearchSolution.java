package CS5800;

/**
 * Each element of an array A[1, ..., n] is a digit (0, …, 9). The array is ordered:A[i]≤A[i+1] for
 * all i. Consider the problem of finding the sum of array A[1, ..., n].
 */
public class BinarySearchSolution {
  public static void main(String args[]) {
    int[] nums = new int[] { 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    //int res = countNums(nums);
    int res = findIndex(nums);
    System.out.println(res);
  }

  public static int findIndex(int[] nums) {

    int target = nums[0];
    int resRight = 0;
    int resLeft = 0;
    int sum = 0;
    int[] temp = new int[9];
    for (int i = 0; i < 9; i++) {
      int left = 0;
      int right = nums.length - 1;
      while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
          resRight = mid;
          left = mid + 1;
        } else if (nums[mid] < target) {
          left = mid + 1;
        } else if (nums[mid] > target) {
          right = mid - 1;
        }
      }

      int res = resRight - resLeft + 1;
      temp[i] = res;
      sum += res * target;
      resLeft = resRight + 1;
      target += 1;
    }


    return sum;
  }

  /*
  public static int findLeftIndex(int[] nums, int target) {
    int res = 0;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        //        if (nums[mid - 1] != target) {

        //          return res;
        //        }
        res = mid;
        right = mid - 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      }
    }
    return res;
  }

  public static int findRightIndex(int[] nums, int target) {
    int res = 0;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        //        if (nums[mid + 1] != target) {
        //          res = mid;
        //          return res;
        //        }
        res = mid;
        left = mid + 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      }
    }
    return res;
  }

  public static int countNums(int[] nums) {
    int[] res = new int[nums.length];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      res[i] = findRightIndex(nums, i + 1) - findLeftIndex(nums, i + 1) + 1;
    }
    for (int i = 0; i < 9; i++) {
      sum += res[i] * (i + 1);
    }
    return sum;
  }*/
}
