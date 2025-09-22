package JAVA.Recursion;
// the code will go infinite as n-- ( pass first the reduce ) , so we have to use --n

public class incrementconcept {
    public static void main(String[] args) {
        System.out.println(decrement(5));
    }
    public static int decrement(int n){
        if ( n == 0){
            return 0 ;
        }
        System.out.println(n);
         return decrement(n--);
    }
}
