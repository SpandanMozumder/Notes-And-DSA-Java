
public class MaxSubarraySum1 {

    public static void subarraysum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.println("Current Sum " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum " + maxSum);

    }

    public static void main(Strings[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        subarraysum(arr);
    }
}
