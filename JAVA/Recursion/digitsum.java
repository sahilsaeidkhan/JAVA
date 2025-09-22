package JAVA.Recursion;
public class digitsum {
    public static void main(String[] args) {
        int n = 123456;
        System.out.print( digit(n));
    }
    public static int digit(int n){
      if ( n == 0){
        return 0;
      }
      return digit(n/10) + ( n%10);
    }
}