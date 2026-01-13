package sorting;

import java.util.Scanner;

public class prog1_selctionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter elements of array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();   
    }

    // Call selection sort
    selectionSort(arr);

    // Print sorted array
    System.out.println("Sorted array:");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }

    sc.close();
}

}