import java.util.*;
public class ArrLargestNum {
    public static void largest(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest number: " + max);
    }

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        largest(arr);
    }

}
