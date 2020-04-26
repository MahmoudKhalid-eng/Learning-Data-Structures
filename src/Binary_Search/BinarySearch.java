package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

// Implementation of recursive Binary Search
public class BinarySearch {
    // Returns index of key if it is present in arr [start-->end] else returns -1
    int binSearch(int arr[],int start,int end,int key){ // the array , the beginning and end points,key
        int mid = (start + end)/2; // or : (end - start)/2 + start
        if(end >= start){
            if(key == arr[mid]){ // If key is found at the mid of the array
                return mid; // return the position of the mid
            }
            if(key < arr[mid]){ // If the key is smaller than the mid -> search at the left subarray
                return binSearch(arr, start, mid - 1, key);
            }
            // If the key is greater than the mid -> search at the right subarray
            return binSearch(arr, mid + 1, end, key);
        }
        // If function reached here that means that no one of the previous return statements occured
        // So it means that the key wasn't found at the array -> return -1
        return -1;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0 ;i < size ; i++){
            arr[i] = inp.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the search key");
        int key = inp.nextInt();
        BinarySearch srch = new BinarySearch();
        int res = srch.binSearch(arr, 0, size-1, key);
        if(res == -1){
            System.err.println(key + " Not Found ");
        }
        else{
            System.out.println(key + " Is Found after sorting at the position number : " + (res+1));
        }
    }
}
