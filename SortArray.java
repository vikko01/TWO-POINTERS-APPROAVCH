import java.util.Scanner;

public class SortArray {
    
    static void printArray(int arr[]){
        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZerosAndOnes(int arr[]){
        int n = arr.length;
        int zeros = 0 ;
        
        // count the number 
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }

        // 0 to 0-1 : 0
        // zeros to n-1 : 1

        for(int i = 0 ; i < arr.length ; i++){
            if(i < zeros){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }

        // main function 

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of the array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter the" + n + "elements of the array");
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("ORIGINAL ARRAY");
            printArray(arr);
            sortZerosAndOnes(arr);
            System.out.println("SORTED ARRAY");
            printArray(arr);
        }
    }

