package JAVA.Recursion;
// count number steps to make a number zero -- ony two way ( if it's even divide by 2 and if odd subtract by 1)

import java.util.Scanner;

public class steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int c = counts(n,0);
        System.out.println(c);
    }
    public static int counts(int n , int count){
             if ( n == 0) {
                return count;
             }
             if ( n % 2 == 0){
                count++;
                return counts( n/2 , count);
             }
             else {
                count++;
                 return counts(n-1,count);
             }
    }
}
