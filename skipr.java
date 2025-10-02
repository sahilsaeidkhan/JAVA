public class skipr {
    public static void main(String[] args) {
        System.out.println(skip("","kashishyadav"));
    }
    public static String skip(String p , String up){
        if ( up.isEmpty()){
            return "p";
        }
        char ch = up.charAt(0);
        
        if ( ch == 'a'){
             return skip(p,up.substring(1));
        }
        else {
            return ch + skip(p,up.substring(1));
        }
    }
}
