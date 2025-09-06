package JAVA.Sorting;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class duplicateleet{
    public static void main(String[]args){

      int[] duplicate = {2,3,4,2};
      insertionsort(duplicate);
          System.out.println(checkduplicate(duplicate));
}
       
      static void insertionsort(int[] dupl) {
    for (int i = 1; i < dupl.length; i++) {
        int j = i;
        while (j > 0 && dupl[j] < dupl[j - 1]) {
            swap(dupl, j, j - 1);
            j--;
        }
    }
}
        static void swap(int[] dupli , int second , int first){
            int temp = dupli[second];
            dupli[second] = dupli[first];
            dupli[first] = temp;
        }
          static boolean checkduplicate(int[] duplicate){
            int j = 1;
            while ( j<duplicate.length){
                if ( duplicate[j]==duplicate[j-1]){
                    return  true;
                }
                else j++;
            } return false;
          }     
    
}