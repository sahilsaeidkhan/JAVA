package JAVA.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        String str = "abcd";
        char target = 'g';
        int found = 0;
        for ( int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);

            if ( ch > target){
                System.out.println(ch + " " +  "is greater than" + " " + target);
                found++;
            }
        }   
        if ( found == 0){
                  System.out.println( str.charAt(0));
        } 
       
    }
}
