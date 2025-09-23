// Doing Reverse of a Number using Recursion 
public class reverse {
    public static void main(String[] args) {
        int n = 4645;
           Rev(n);
        System.out.println(sum);
     
    }
    int sum = 0;
    public static void Rev(int n){
        if ( n ==0){
            return ;
        }
        int rem = n%10; 
        sum = sum * 10 + rem;
        Rev(n/10);
      
    }
}
