package JAVA.Others;
import java.util.Scanner;

public class alphabetcasecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().trim().charAt(0);
        if ( ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}
