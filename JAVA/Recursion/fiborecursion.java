package JAVA.Recursion;
// fibonacci series simple question

import java.util.Scanner;

public class fiborecursion {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth number you want to print of fibonacci series ");
    int n = sc.nextInt();

    int fibono = fib(n);
    System.out.println("Fibo series at " + n + " " + "is" +  " " + fibono);
   }

   static int fib(int n){
    if ( n < 2 ){
        return n;
    }
    return fib(n-1) + fib(n-2);
   }
}
