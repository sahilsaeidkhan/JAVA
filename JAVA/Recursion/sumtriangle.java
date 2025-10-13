import java.util.Arrays;

class sumtriangle{
    public static void main(String[] args) {
        int arr[] = {2,5,3,6,4,7};
        sum(arr);
    }
    public static void sum(int[] arr){
        if ( arr.length == 1){
            return;
        }
        int[] temp = new int[arr.length-1];
        for ( int i = 0;i<arr.length-1;i++){
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }
        sum(temp);


        // to print the array
        System.out.println(Arrays.toString(arr));
    }
}