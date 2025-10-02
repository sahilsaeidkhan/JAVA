package JAVA.Recursion;
// skip whole string

public class skipwh {
    public static void main(String[] args) {
        System.out.println(skip("","iamkingiambest"));
    }
    public static String skip(String p , String up){
        if ( up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);
        if (up.startsWith("am")){
             return skip(p,up.substring(2));
        }
        else {
            return skip(p+ch,up.substring(1));
        }
    }
}