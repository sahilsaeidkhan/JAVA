
public class ithbit {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        int n =9;
        System.out.println(knowbit(n));
    }
    public static int knowbit(int n){
       if ( (n&(1<<3)) == 0) {
           return 0;
       }  
       else return 1;
    }
}
