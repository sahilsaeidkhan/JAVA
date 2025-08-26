package JAVA;

public class functions {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // Should print true
        System.out.println(isArmstrong(535)); // Should print false
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = countDigits(num);
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }
        
        return sum == original;
    }
    
    private static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
