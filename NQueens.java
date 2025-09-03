public class NQueens {
    public static void main(String[] args) {
        pattern();
    }
    static void pattern(){
        int n = 8;
        for ( int i = 0;i<=n;i++){
            // increasing
            if ( i<=n/2){
                for ( int j = 0;j<=i;j++){
                    System.out.print("*");
                }
              
            } 
            // decreasing 
           else     {
                for (int j=0;j<=n-i;j++){
                    System.out.print("*");
                }
            }
             System.out.println(); 
        }
    }
}