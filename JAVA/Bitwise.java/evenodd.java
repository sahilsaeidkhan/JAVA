public class evenodd {
    public static void main(String[] args) {
        int n = 39;
        System.out.println(isodd(n));
    }
    static boolean isodd(int n){
       return ( n & 1) == 1;
    }
}
