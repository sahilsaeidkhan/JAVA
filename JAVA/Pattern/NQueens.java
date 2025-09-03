package JAVAPattern;

public class NQueens {
    public static void main(String[] args) {
        pattern();
    }
    static void pattern(){
        for ( int i = 0;i<=8;i++){
            if ( i == 0 && i<=5){
                for ( int j = 0;j<i;j++){
                    System.out.println("*");
                }
            } if ( i>5){
                for ( int k = 4;k>1;k++){
                    System.out.println("*");
                }
            }
        }
    }
}
