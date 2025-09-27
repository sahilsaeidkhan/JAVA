package JAVA.Recursion;
// sorting array using merge sort 

import java.util.Arrays;

 class mergesort {
    public static void main(String[] args) {
        int[] arr = { 5,8,2,6,83,56};
          int[]  a = merge(arr);
             System.out.println(Arrays.toString(arr));
             System.out.println(Arrays.toString(a));
     }
     public static int[] merge(int[] arr){
             if ( arr.length == 1){
                return arr;
             }
         int mid = arr.length / 2;
         int[] left = merge(Arrays.copyOfRange(arr,0,mid));
         int[] right = merge(Arrays.copyOfRange(arr,mid,arr.length));

         return mergeboth(left,right);
     }
     public static int[] mergeboth(int[] left , int[] right){
        int i = 0;
        int j = 0;
        int k = 0;

            int[] mix = new int [ left.length + right.length ]; 

      while(i<left.length && j<right.length){

              if ( left[i]<right[j] ) {
                  mix[k] = left[i];
                  i++;
        }
        else {
            mix[k] = right[j];
            j++;
        }   k++;
      }    while( i<left.length){
                mix[k] = left[i];
                i++;
                k++;
                
      }         while( j<right.length){
                 mix[k] = right[j];
                 j++;
                 k++;
      }
     return mix;
     } 
}