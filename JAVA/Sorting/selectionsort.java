package JAVA.Sorting;
import java.util.Arrays;

// put max or min element and put in right position 
public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,3};
        // we wil find max and put in right position 
        sort(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for ( int i = arr.length-1; i>0;i--){
            // maxindex
         int maxindex=  max(arr, i);
           // swap
           swap(arr,maxindex,i);
        }
    }
    static void swap ( int[] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int max(int[] arr , int end){
        int maxindex= 0;
       for ( int  i = 1; i<=end;i++){
        if ( arr[i] > arr[maxindex]){
               maxindex = i;
        }

        } return maxindex;

    }
}
