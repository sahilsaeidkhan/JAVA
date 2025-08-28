package Sort;
public class duplicatecyclic {
    public static void main(String[] args) {
        int[] arr = {3,2,1,2};
       System.out.println("Duplicate Number is " + " " + sort(arr)); 
    }
    static int sort(int[] arr){
        int i = 0;
        int N = 4;
        while ( i<arr.length){
            int correct = arr[i]-1;
            if ( arr[i]< N && arr[i] != arr[correct]){
                   //swap 
                   swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        // code to know which one is duplicate number 
        for ( i = 0; i<arr.length; i++){
               if ( arr[i] != i+1 && arr[i]-1 == arr[i]){
                return arr[i];
               }

        } return -1;
    }        static void swap(int[] arr, int i , int j){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
    }
}
