
public class MaxSubarraySum2 {

    public static void subarraysum2(int num[]) {
        int currSum = 0;
        int maxSum = 0;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum); 
    }

    public static void main(Strings[] args) {
        int num[] = {1, 2, 3, -2, 5};
        subarraysum2(num);
    }
}
  