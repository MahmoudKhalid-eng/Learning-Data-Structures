
package Seq_Search;
import java.util.Scanner;

    

public class SequentialSearch {
    public static int search(int arr[],int size,int searchKey){
    for(int i=0;i<size;i++){
        if(arr[i]==searchKey){
            return i;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       int n = inp.nextInt(); // size of array
       int[] arr=new int[n];
       for(int i=0;i<n;i++){ // array elements
           arr[i] =inp.nextInt();
       }
       int key = inp.nextInt(); // search key
       int res = search(arr, n, key);

       if(res==-1) System.out.println("Not found !");
       else System.out.println(key+" is found at index : "+(res+1));
    }
}
