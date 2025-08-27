public class missingcyclicsort {
   public static void main(String[] args) {
    int[] arr = {4,1,2};

      //   System.out.println(Arrays.toString(arr));

        System.out.println("Missing Number in the array is" + " " + missingcycle(arr));

   } 

   static int missingcycle(int[] arr){
   int i = 0;
   int n = 4;
   while (i<arr.length){
      int correcti = arr[i] - 1;
      if ( arr[i] < n && arr[i] != arr[correcti]){
         //swap
         swap(arr,i,correcti);
      }
      else { 
         i++;
      }
   } 
   for ( i = 0 ;i<arr.length;i++){
   if (arr[i] != i+1){
      return i+1;
   }

}
return n;
}  
   // swap code
                    static void swap(int[] arr , int i , int j){
                  int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
                    }
}
