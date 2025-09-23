// check sorted or not

public class sort {
    public static void main(String[] args) {
        int arr[] = {1,4,6,97,15};
        int i =0;
        System.out.println(sortarray(arr,i));
    }
    public static boolean sortarray(int[] arr, int i){
        if ( i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sortarray( arr, i+1);
    }
}
 