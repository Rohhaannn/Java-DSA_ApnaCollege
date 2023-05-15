//this program is performed using brute force algorithm which time complexity of O(n3) which is very bad
// to imporove this we can use prefix sum method which is applied in maxSubArray_II.java


//Brute force

public class MaxSubarray_I {
  public static void MaxSubArray(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i<numbers.length; i++) {
      int start = i;
      for (int j=i; j<numbers.length; j++) {
        int end = j;
        currSum = 0;
        for (int k=start; k<=end; k++) {  //print
          //subarray sum
          currSum += numbers[k];
        }
        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max Sum: " + maxSum);
  }
  public static void main(String[] args) {
    int numbers[] = {2,4,6,8,10};
    MaxSubArray(numbers);
  }
}
