// Given a 2D integer array matrix, return the transpose of matrix.

//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{2,3,5},{7,4,6}};
        int[][] brr = new int [arr[0].length][arr.length];
        trans(arr,brr);
    
    for( int[] row : brr){
        for ( int val  :row){
            System.out.print(val + " ");
        }
        System.out.println();
    } }
    static void trans(int[][] arr , int[][] brr){
        for ( int row = 0;row<arr.length;row++){
            for ( int col = 0;col< arr[row].length;col++){
                   brr[col][row] = arr[row][col]; 
            }
        }
        
    }
}
