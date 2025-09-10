 // 1351. Count Negative Numbers in a Sorted Matrix

public class negative {
    public static void main(String[] args) {
        int count = 0;
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        for ( int row = 0; row<arr.length; row++){
            for ( int column = 0; column<arr[row].length; column++){
               if(arr[row][column]<0){
                count++;
               }

            }
        }
        System.out.print(" Total negative number is " + count );
    }
}
