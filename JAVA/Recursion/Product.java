// Product of a number using recursion

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if ( n > 0){
            System.out.println(prod(n));
        }
        else {
            System.out.println("Enter a positive number");
        }
       
    }
    public static int prod(int n){
        if ( n == 1){
            return 1;
        }
        return n * prod( n-1 );
    }
}
