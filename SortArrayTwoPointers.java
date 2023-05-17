import java.util.Scanner;

public class SortArrayTwoPointers {
    
    // Array Printing Method
    static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // swapping method 
    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Sorting Method

    static void sortZerosAndOnes(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
     while(i < j){
         if(arr[i] == 1 && arr[j] == 0){
            swap(arr , i , j);
            i++;
            j--;
        }
        if(arr[i] == 0){
            i++;
        }
        if(arr[j] == 1){
            j--;
        }
    }
}

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the" + n + "elements of the array");
        for(int i = 0 ; i < n ; i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println("ORIGINAL ARRAY");
        printArray(arr);
        sortZerosAndOnes(arr);
        System.out.println("SORTED ARRAY");
        printArray(arr);
    }
}
