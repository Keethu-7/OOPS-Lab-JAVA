import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] sortedArray=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter number: ");
            sortedArray[i]=sc.nextInt();
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(sortedArray[i]+" ");
        }
        System.out.println();

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        int index = binarySearch(sortedArray,key);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
