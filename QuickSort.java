import java.util.*;

public class QuickSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        String[] names=new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter name: ");
            names[i]=sc.next();
        }
        quickSort(names,0,n-1);
        System.out.println("Sorted names: ");
        for(int i=0;i<n;i++){
            System.out.print(names[i]+"  ");
        }
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j=low;j<high;j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
