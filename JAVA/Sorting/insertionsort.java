package JAVA.Sorting;
import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {2,1,6,5,11,0,-4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for ( int i = 0; i<arr.length-1;i++){
            for ( int j = i+1;j>0;j--){
                if ( arr[j] < arr[j-1]){
                    swap(arr, j ,  j-1);
                }
                else {
                    break;
                }
            }
        } }
           static void swap(int[] arr , int first , int second){
                  int temp = arr[first];
                  arr[first] = arr[second];
                  arr[second] = temp;
        }
}
