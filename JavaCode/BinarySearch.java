import java.util.Scanner;
public class BinarySearch {
    public static void search(int arr[], int k){
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(arr[mid] == k){
                System.out.println("Element found at index: " + mid);
                return;
            }
            if(arr[mid] < k){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int k = sc.nextInt();
        search(arr, k);
    }
}
