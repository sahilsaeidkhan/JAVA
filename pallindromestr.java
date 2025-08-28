
public class pallindromestr {
    public static void main(String[] args){

        String pallindrome = "abcba";

            boolean result = ispalindrome(pallindrome);
            System.out.println(result);
    }

             static boolean ispalindrome( String pallindrome){

            int start = 0;
            int end = pallindrome.length() - 1;
            
            while ( start <= end ){
                    if ( pallindrome.charAt(start) != pallindrome.charAt(end)) {
                     return false;
                       }  start ++;
                       end --;
                    }
                     return true;
            }
    }

