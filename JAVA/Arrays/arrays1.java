package JAVA.Arrays;
public class arrays1 {
    public static void main(String[] args) {
    int[][] arr = {{3,4},{3,5}};
    for ( int row  = 0; row<arr.length;row++){
        for ( int column = 0; column<=arr[row].length;column++){
            System.out.println(arr[row][column]);
        }
    }
}}
