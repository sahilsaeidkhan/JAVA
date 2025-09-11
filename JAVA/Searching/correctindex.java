public class correctindex {
    public static void main(String[] args) {
        int arr[] = {3,5,7,9};
        int target = -8;
        System.out.println("Insert position: " + index(arr,target));
    }
    
    static int index(int[] arr, int target) {

        if (target < arr[0]) return 0;
        if (target > arr[arr.length-1]) return arr.length;
        
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }
}