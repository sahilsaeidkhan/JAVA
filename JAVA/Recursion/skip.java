package JAVA.Recursion;
// delete a from the String 

public class skip {
    public static void main(String[] args) {
        String a = "sahilsaeid";
        skipa("",a);
    }

    public static void skipa(String result , String old){
       if ( old.isEmpty()){
        System.out.println(result);
        return;
       }
       char ch = old.charAt(0);

       if ( ch == 'a'){
        skipa(result,old.substring(1));
       }
       else {
        skipa(result+ch,old.substring(1));
       }
    }
}
