package JAVA.Arrays;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int k = 6;
        int a = k % arr.length;
        rotate(arr,a);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int a){
        swap(arr,0,arr.length-1);
        swap(arr,0,a-1);
        swap(arr,a,arr.length-1);
    }
    public static void swap(int[] arr, int start , int end ){
while ( start<end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    start ++;
    end --;
}
    }
}
