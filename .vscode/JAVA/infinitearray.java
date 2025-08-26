package JAVA;
public class infinitearray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9,13,45,65,78};
        int target = 45;
        int answer = ans(arr,target);
        if ( answer != -1){
            System.out.println("Element found" + answer);
        }
        else {
            System.out.println("Element not found");
        }
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
    
        while(target > arr[end]){
            int temp = end + 1;
            end = end + ( end - start + 1) *2;
            start = temp;

        }
        return binarysearch(arr, start , end , target );
    }
        static int binarysearch(int[] arr, int target  , int start  , int end ){
            while ( start <= end){
                
                int mid = start + (end - start) /2;
                if ( target == arr[mid]){
                return mid;
             }
                
                 if ( target > arr[mid]){
                    start = mid + 1;
                 }
                 else {
                    end = mid -1;
                 } 
            }   return -1;
        } 
}
