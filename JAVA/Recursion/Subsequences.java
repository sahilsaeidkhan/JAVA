package JAVA.Recursion;

public class Subsequences {
    public static void main(String[] args) {
        subsequence("","abcd");
    }
    public static void subsequence(String p , String up){
        if ( up.isEmpty()){
            System.out.println(p);
            return;
        }
       char ch = up.charAt(0);

        subsequence(p+ch, up.substring(1));
        subsequence(p,up.substring(1));
    }
}
