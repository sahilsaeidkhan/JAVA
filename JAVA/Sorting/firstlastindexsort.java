package JAVA.Sorting;
public class firstlastindexsort {
    public static void main(String[] args){
        int[] brr = {1,2,2,3,3,4,4,5,6};
        int target = 4;
        System.out.println( findindex(brr,target));
    }
    static int findindex(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while ( start <end ){
            int mid = start + (end - start)/2;
            if ( target == arr[mid] ){
                return mid;
            }
            if ( target > arr[mid] ){
                     start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        } return -1;
    }
}
