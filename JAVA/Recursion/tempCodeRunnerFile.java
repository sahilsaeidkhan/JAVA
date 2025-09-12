// write a recursive function to calcualte the sum of first n natural numbers

import java.util.Scanner;
class Main{
    static int sum(int x){
        if ( x == 1 ){
            return 1;
        } else {
         return x + sum(x-1);
    }
    }
    public static void main(String args[]){
        System.out.print("Enter a number ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print("The sum is " + sum(n));
    }
}
