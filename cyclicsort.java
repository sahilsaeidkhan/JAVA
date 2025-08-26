// a basic cyclic sort program 

import java.util.Arrays;
public class cyclicsort{
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,2,1};
        sort(arr); // using sort function to sort the array
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while ( i < arr.length){
            int correctindex = arr[i]-1;
            if ( arr[i] != arr[correctindex]){
                // swap them
                swapcyclicsort(arr,i ,correctindex);
            }
            else{
                i++;
            }
        }
    }
    static void swapcyclicsort(int arr[],int i , int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}