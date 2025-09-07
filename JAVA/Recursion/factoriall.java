// wap to print factorial using recursion
import java.util.Scanner;
class factoriall{
    static int factorial( int x){
        if ( x == 0 || x == 1 ){
            return 1;
        } else {
            return x*factorial(x-1);
        }
    }
    public static void main(String[]args){
        System.out.print("Enter a number to print it's factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The factorial of " + n + " is " + factorial(n) ) ;
    }
}