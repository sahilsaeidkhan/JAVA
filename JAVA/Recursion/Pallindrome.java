public class pallindrome {
    public static void main(String[] args) {
        int n = 121;
        int orig = n;
        if ( pallin(n) == orig){
            System.out.println( n + "It is a pallindrome");
        }
        else {
            System.out.println(n + "It is not a pallindrome");
        }
    }
    public static int pallin(int n){
        if ( n < 0){
            return n ;
        }
        int digit = n % 10;
        int power = (int)Math.log10(n);
       return digit * (int) Math.pow (10,power) + pallin(n/10);
    }
}
