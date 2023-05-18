import java.util.Scanner;

public class SortEvenOdd {
    
    // for swapping
    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // for print array
    static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for sorting a/c to odd or even numbers 
    static void sortEvenOdd(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]%2 != 0 && arr[j]%2 == 0){
                swap(arr, i, j);
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2!=0){
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the" + " " + n + " " + "elements of the array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ORIGINAL ARRAY");
        printArray(arr);
        sortEvenOdd(arr);
        System.out.println("SORTED ARRAY");
        printArray(arr);
    }

}
