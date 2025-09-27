package JAVA.Pattern;
public class descendingletters {
    public static void main(String[] args) {
       
        for ( int i = 0;i<5;i++){
            int a = 69;
            a = a-i;
            for ( int j = 0; j<=i;j++){
                char ch = (char)a;
                System.out.print(ch + " ");
                a++;
            } 
            System.out.println();
            
        }
    }
}
