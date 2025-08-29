package JAVA.Recursion;
 // simple question of binary search using recursion

public class recursionbinary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = -5;
         int start = 0;
         int end =  arr.length-1;
 int result = binary(arr, target, start, end);

        if (result == -1) {
            System.out.println("No, not found");
        } else {
            System.out.println("Yes, it is found on index " + result);
        }
    }
    static int binary(int[] arr , int target , int start , int end ){
   
        if ( start > end ){
            return -1;
        }
       
       int  mid = start + (end - start )/2;

 if (target == arr[mid]){
            return mid;
        }

        if ( mid < target){
            return binary(arr,target,mid+1,end);
        }
        else {
            return binary(arr, target,start,mid-1);
        }
    }
}
