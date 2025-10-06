// return subsets of "abc" with ascii values in list 

import java.util.ArrayList;
class asciisets{
    public static void main(String[] args) {
        String a = "ab";
        ArrayList<String> result = sub("",a);
        System.out.println(result);
    }
    public static ArrayList<String> sub(String p , String up){
        if ( up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
                 list.add(p);
                 return list;}

                 char ch = up.charAt(0);
        ArrayList<String> first =  sub( p,up.substring(1));
        ArrayList<String> second =  sub( p+ch,up.substring(1));
        ArrayList<String> third  = sub( p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    } 
}
