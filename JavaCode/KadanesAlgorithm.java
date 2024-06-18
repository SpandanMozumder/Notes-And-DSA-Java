
public class KadanesAlgorithm {

    public static void algorithm(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            currentSum += numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        //if all negative numbers then all current sum is 0 then find the largest number and print it
        algorithm(numbers);
    }
}
