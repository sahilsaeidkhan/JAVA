package JAVA.Searching;
public class ifexist {
    public static void main(String[] args) {
        int[] arr = { 2,1,3,7};
        System.out.println( ifexistornot(arr));
    }
    public static boolean ifexistornot(int[] arr){
        for ( int i = 0;i<arr.length;i++){
            for ( int j = 0;j<arr.length;j++){
                if ( i!=j && arr[i] == 2*arr[j]){
                    return true;
                }
            }  
        } return false;
    }
}
