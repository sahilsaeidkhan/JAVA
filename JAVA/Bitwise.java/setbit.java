// change the ith bit to 1

public class setbit {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(changebit(n));
    }
    static int changebit(int n){
        return ( n | (1<<3) ) ;
    }
}
