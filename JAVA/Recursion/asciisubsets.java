package JAVA.Recursion;
public class asciisubsets {
        public static void main(String[] args) {
        skip("","ab");
    }
    public static void skip(String p , String up){
        if ( up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        
        if ( ch == 'a'){
            skip(p,up.substring(1));
        }
             skip(p+ch,up.substring(1));
             skip(p+(ch+0),up.substring(1));
    
    }
}
