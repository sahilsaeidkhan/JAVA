package JAVA;
public class binary2darrays {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {6,11,20,50},
            {7,15,25,100},
            {10,19,30,105}
        };
        // works for strictly sorted 
         int[][] strictlysorted = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 4;
        System.out.println(ans(arr, target));
    }
    static String ans(int[][] arr , int target){
        int r = 0;
        int c= arr[r].length-1;
        
        while ( r<arr.length && c>=0){
           if ( target == arr[r][c] ){
            return "Element Found" +" " +  arr[r][c];
           }
        if ( target > arr[r][c]){
            r++;
        }
        else {
            c--;
        } 
    }  return "Element not found";
} 
}
