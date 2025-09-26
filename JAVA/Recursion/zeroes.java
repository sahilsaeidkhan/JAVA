package JAVA.Recursion;
public class zeroes {
    public static void main(String[] args) {
        int n = 50030900; 
        int a = count(n, 0);
        System.out.println(a);
    }
    public static int count(int n , int count){
         if ( n == 0 ){
            return count ;
         }
         int rem = n % 10;
         if ( rem == 0){
            count++;
            return count(n/10, count);
         }
         else {
             return count(n/10, count);
         }  
       
    }   
}
