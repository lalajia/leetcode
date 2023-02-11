package BinaryRecursion;
// Java Program to Illustrate Recursive Binary Search

// Importing required classes
import java.util.*;

public class CompareBtwIterationRecursion {


  // Main class
  static class Recursion {

    // Method 1
    // Recursive binary search
    // Returns index of x if it is present
    // in arr[l..r], else return -1
    int binarySearch(int arr[], int l, int r, int x)
    {
      // Restrict the boundary of right index
      // and the left index to prevent
      // overflow of indices
      if (r >= l && l <= arr.length - 1) {

        int mid = l + (r - l) / 2;

        // If the element is present
        // at the middle itself
        if (arr[mid] == x)
          return mid;

        // If element is smaller than mid, then it can
        // only be present in left subarray
        if (arr[mid] > x)
          return binarySearch(arr, l, mid - 1, x);

        // Else the element can only be present
        // in right subarray
        return binarySearch(arr, mid + 1, r, x);
      }

      // We reach here when element is not present in
      // array
      return -1;
    }

    // Method 2
    // Main driver method
    public static void main(String args[])
    {

      // Creating object of above class
      Recursion ob = new Recursion();

      // Custom input array
      int arr[] = { 2, 3, 4, 10, 40 };

      // Length of array
      int n = arr.length;

      // Custom element to be checked
      // whether present or not
      int x = 10;

      // Calling above method
      int result = ob.binarySearch(arr, 0, n - 1, x);

      // Element present
      if (result == -1)

        // Print statement
        System.out.println("Element not present");

        // Element not present
      else

        // Print statement
        System.out.println("Element found at index "
            + result);
    }
  }


  // Java Program to Illustrate
  // Iterative Binary Search

  // Main class
  // BinarySearch
  static class Iteration {

    // Method 1
    // Returns index of x
    // if it is present in arr[],
    // else return -1
    int binarySearch(int arr[], int x)
    {

      int l = 0, r = arr.length - 1;

      // Checking element in whole array
      while (l <= r) {
        int m = l + (r - l) / 2;

        // Check if x is present at mid
        if (arr[m] == x)
          return m;

        // If x greater, ignore left half
        if (arr[m] < x)
          l = m + 1;

          // If x is smaller,
          // element is on left side
          // so ignore right half
        else
          r = m - 1;
      }

      // If we reach here,
      // element is not present
      return -1;
    }

    // Method 2
    // Main driver method
    public static void main(String args[])
    {

      Iteration ob = new Iteration();

      // Input array
      int arr[] = { 2, 3, 4, 10, 40 };
      // Length of array
      int n = arr.length;
      // Element to be checked if present or not
      int x = 10;

      // Calling the method 1 and
      // storing result
      int result = ob.binarySearch(arr, x);

      // Element present
      if (result == -1)

        // Print statement
        System.out.println("Element not present");

        // Element not present
      else

        // Print statement
        System.out.println("Element found at index "
            + result);
    }
  }



}
